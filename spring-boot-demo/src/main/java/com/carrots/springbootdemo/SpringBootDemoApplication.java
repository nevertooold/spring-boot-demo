package com.carrots.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	private static final String PATH_PROPERTY = "server.servlet.context-path";
	private static final String PATH = "/springbootdemo";
	
	public static void main(String[] args) {
		System.setProperty(PATH_PROPERTY, PATH);
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
