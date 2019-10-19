package com.hadialaoui.microservices.employeesservice.infrastructure;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hadialaoui.microservices.employeesservice.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findEmployeeByRefog(String refog);
}
