package com.donggyu.springboot.demo.mycoolapp;

import com.donggyu.springboot.demo.mycoolapp.dao.StudentDAO;
import com.donggyu.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {

			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Paul", "Doe", "asd@gmail.com");

		studentDAO.save(student);
	}
}
