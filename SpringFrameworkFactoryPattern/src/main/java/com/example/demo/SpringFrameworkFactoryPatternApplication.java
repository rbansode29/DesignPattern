package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controller.GreetingController;

@SpringBootApplication
public class SpringFrameworkFactoryPatternApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringFrameworkFactoryPatternApplication.class, args);
		
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		greetingController.getGreeting();
	}

}
