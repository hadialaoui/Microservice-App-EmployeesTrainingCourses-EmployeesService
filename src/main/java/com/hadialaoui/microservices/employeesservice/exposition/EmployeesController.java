package com.hadialaoui.microservices.employeesservice.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hadialaoui.microservices.employeesservice.entities.Employee;
import com.hadialaoui.microservices.employeesservice.services.EmployeeService;

@RequestMapping("/employees")
@RestController
public class EmployeesController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(value="")
	public void addEmployee(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
	}
	
	@GetMapping(value="/{employeeRefog}")
	public Employee getEmployeeById(@PathVariable String employeeRefog){
		return employeeService.findEmployeeByRefog(employeeRefog);
	}
	
	@GetMapping(value="")
	public List<Employee> getAllEmployee(){
		return employeeService.findAllEmployee();
	}

	
	@PutMapping(value="/{employeeRefog}")
	public Employee updateEmployee(@PathVariable String employeeRefog ,@RequestBody Employee employee){
		return employeeService.updateEmployee(employeeRefog, employee);
	}
	
	@DeleteMapping(value="/{employeeRefog}")
	public void deleteEmployee(@PathVariable String employeeRefog){
		 employeeService.deleteEmployee(employeeRefog);
	}
	
}
