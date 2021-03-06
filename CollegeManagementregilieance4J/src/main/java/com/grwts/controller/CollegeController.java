package com.grwts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.feign.proxy.FeaignProxy;
import com.grwts.pojo.CollegeVo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CollegeController {
	@Autowired
	private FeaignProxy feaignProxy;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment environment;

	@GetMapping(path = "/display")
	@Retry(name = "default", fallbackMethod = "getStudentFallBack")
	// @CircuitBreaker(name = "default",fallbackMethod = "getStudentFallBack")
	public CollegeVo getStudent() {
		logger.info("logger retry");
		CollegeVo collegeVo = feaignProxy.display();
		collegeVo.setPort(environment.getProperty("local.server.port"));
		return collegeVo;
	}

	public CollegeVo getStudentFallBack(Exception e) {
		return new CollegeVo(0, null, null, null);
	}

}
