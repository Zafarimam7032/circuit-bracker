package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CollegeManagementregilieance4JApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementregilieance4JApplication.class, args);
	}

}
