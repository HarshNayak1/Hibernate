package com.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.springboot.model.Employee;
import com.javaguides.springboot.model.EmployeeIdentity;
import com.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class HibernateCompositeKeyApplication implements CommandLineRunner {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateCompositeKeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      
		Employee employee = new Employee(new EmployeeIdentity("E-100","C-1001"), "harsh", "h@gmail.com", "83499339");
		
		employeeRepository.save(employee);
	}

}
