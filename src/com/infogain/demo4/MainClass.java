package com.infogain.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Customer cust = (Customer) factory.getBean("CustomerBean");
		System.out.println(cust);

	}

}
