package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.factory.HelloWorldServiceFactory;
import com.example.demo.services.HelloWorldService;

@Configuration
public class FactoryPatternConfig {

	@Bean
	public HelloWorldServiceFactory helloWorldServiceFactory() {
		return new HelloWorldServiceFactory();
	}

	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldServiceFactory factory) {
		return factory.createHelloWorldService("en");
	}

	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldServiceFactory factory) {
		return factory.createHelloWorldService("sp");
	}

	@Bean
	@Profile("french")
	public HelloWorldService helloWorldServiceFrenchImpl(HelloWorldServiceFactory factory) {
		return factory.createHelloWorldService("fr");
	}
}
