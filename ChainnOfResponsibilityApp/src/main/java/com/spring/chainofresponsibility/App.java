package com.spring.chainofresponsibility;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.chainofresponsibility.withdrawl.BankApplication;

/**
 * Bank Application - Chain Of Responsibility Pattern
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Chain Of Responsiblity Design!");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BankApplication bankApplication = (BankApplication) context.getBean("bankApplication");
		bankApplication.doAmountWithdrawal(bankApplication.getAmountWithdrawal());

		context.registerShutdownHook();
	}
}
