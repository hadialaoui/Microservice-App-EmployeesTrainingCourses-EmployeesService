package com.hadialaoui.microservices.employeesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages="com.hadialaoui.microservices.employeesservice.*")
@EnableFeignClients
public class EmployeesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesServiceApplication.class, args); 
	}

}
