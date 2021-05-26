package com.sonata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.sonata.controller"})
public class CourseMainApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseMainApp.class, args);
	}

}
