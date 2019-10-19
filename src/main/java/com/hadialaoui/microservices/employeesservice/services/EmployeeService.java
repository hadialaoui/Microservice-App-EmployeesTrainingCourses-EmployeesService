package com.hadialaoui.microservices.employeesservice.services;

import java.util.List;

import com.hadialaoui.microservices.employeesservice.entities.Employee;

public interface EmployeeService {
     Employee findEmployeeByRefog(String refog);
     List<Employee> findAllEmployee();
     Employee saveEmployee(Employee emp);
     Employee updateEmployee(String refog, Employee emp);
     void deleteEmployee(String refog);
}
