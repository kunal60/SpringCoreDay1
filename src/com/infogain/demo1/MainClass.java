package com.infogain.demo1;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("com/infogain/demo1/spring.xml");
		BeanFactory factory=new XmlBeanFactory(res);*/
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee)factory.getBean("emp");
		System.out.println("Emp Id "+emp.getEmpId()+"Name "+emp.getName()+" Salary "+emp.getSalary());

	}

}
