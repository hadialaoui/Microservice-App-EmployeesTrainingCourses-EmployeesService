package com.hadialaoui.microservices.employeesservice.services.dataSeed;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.hadialaoui.microservices.employeesservice.entities.Employee;
import com.hadialaoui.microservices.employeesservice.services.EmployeeService;

//@Component
public class DataSeed {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostConstruct
	public void fillDB() {
		for (int i = 0; i < 3; i++) {
			Faker faker = new Faker();
			List<String> trainingCours = new ArrayList<>();
			for (int j = 0; j < 5; j++) {
				trainingCours.add(faker.book().title());
			}
			employeeService.saveEmployee(new Employee(faker.idNumber().valid(), faker.name().firstName(),
					faker.name().lastName(), faker.job().title(), trainingCours));
		}
	}
}
