package com.hadialaoui.microservices.employeesservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadialaoui.microservices.employeesservice.entities.Employee;
import com.hadialaoui.microservices.employeesservice.infrastructure.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee findEmployeeByRefog(String refog) {
		Optional<Employee> employee = employeeRepository.findEmployeeByRefog(refog);
      if(!employee.isPresent())
    	  throw new RuntimeException("This employee doesn't exist");
		return employee.get();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		employeeRepository.save(emp);
		return employeeRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(String refog, Employee emp) {
		Employee employee = findEmployeeByRefog(refog);
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employee.setRefog(emp.getRefog());
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(String refog) {
		Employee employee = findEmployeeByRefog(refog);
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {
		
		return employeeRepository.findAll();
	}

}
