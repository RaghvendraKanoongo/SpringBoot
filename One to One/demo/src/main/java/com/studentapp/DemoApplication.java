package com.studentapp;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.repository.CategoryRepo;
import com.studentapp.repository.ProductRepo;
import com.studentapp.repository.StudentRepository;
import com.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	StudentService studentService;
	@Override
	public void run(String... args) throws Exception {
		Address address = new Address(1,"Indore","MP");
		Student student = new Student(1, "Raghav", "CSE",address);
		studentService.addStudent(student);

	}

	@Autowired
	ProductRepo productRepo;
	@Autowired
	CategoryRepo categoryRepo;


}
