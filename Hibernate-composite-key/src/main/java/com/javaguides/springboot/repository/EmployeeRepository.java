package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.model.Employee;
import com.javaguides.springboot.model.EmployeeIdentity;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

	
	
}
