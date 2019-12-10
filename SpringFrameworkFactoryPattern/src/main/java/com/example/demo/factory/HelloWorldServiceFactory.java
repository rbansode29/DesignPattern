package com.example.demo.factory;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceEnglishImpl;
import com.example.demo.services.HelloWorldServiceFrenchImpl;
import com.example.demo.services.HelloWorldServiceSpanishImpl;

public class HelloWorldServiceFactory {
	public HelloWorldService createHelloWorldService(String language) {
		HelloWorldService helloWorldService = null;
		switch (language) {
		case "en":
			helloWorldService = new HelloWorldServiceEnglishImpl();
			break;
		case "sp":
			helloWorldService = new HelloWorldServiceSpanishImpl();
			break;
		case "fr":
			helloWorldService = new HelloWorldServiceFrenchImpl();
			break;
		default:
			helloWorldService = new HelloWorldServiceEnglishImpl();
		}

		return helloWorldService;

	}
}
