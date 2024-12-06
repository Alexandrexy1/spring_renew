package com.studyingjava.demo;

import com.studyingjava.demo.entities.Employee;
import com.studyingjava.demo.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private final SalaryService salaryService;

	public DemoApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(salaryService.netSalary(new Employee("Alex", 4000)));
	}
}
