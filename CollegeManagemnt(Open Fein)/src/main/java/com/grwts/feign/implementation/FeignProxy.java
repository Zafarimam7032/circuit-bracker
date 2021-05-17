package com.grwts.feign.implementation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.grwts.pojo.CollegeVo;

@FeignClient(name = "StudentInfo",path = "/home/student")
public interface FeignProxy {
	@GetMapping(path = "/get")
	public CollegeVo display();

}
