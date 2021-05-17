package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.pojo.StudentVo;

@RestController
@RequestMapping(path = "/home/student")
public class StudentController {
	@GetMapping(path = "/get")
	public StudentVo display()
	{
		return  new StudentVo(1, "Ateef", "New Delhi");
	}

}
