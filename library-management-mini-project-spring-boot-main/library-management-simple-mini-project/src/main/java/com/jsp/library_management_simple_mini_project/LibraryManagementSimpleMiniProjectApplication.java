package com.jsp.library_management_simple_mini_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class LibraryManagementSimpleMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSimpleMiniProjectApplication.class, args);
	}

}
