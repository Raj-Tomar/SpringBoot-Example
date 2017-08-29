package com.raj.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
//@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//This SpringBootServletInitializer run a SpringApplication from a traditional WAR deployment
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
}
