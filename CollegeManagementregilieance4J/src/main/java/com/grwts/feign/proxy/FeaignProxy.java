package com.grwts.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.grwts.pojo.CollegeVo;

@FeignClient(name = "StudentInfo",path = "/home/student")
public interface FeaignProxy {
	@GetMapping(path = "/get")
	public CollegeVo display();

}
