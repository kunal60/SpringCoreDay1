package com.infogain.demo3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee)factory.getBean("emp2");
		emp.show();

	}

}
