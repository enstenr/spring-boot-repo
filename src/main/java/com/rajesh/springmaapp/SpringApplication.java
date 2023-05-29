package com.rajesh.springmaapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Employee.class, ServiceImpl.class);
		IService serviceObj = (IService) ctx.getBean("serviceImpl");
		serviceObj.greetHallo();

		Employee empObj = (Employee) ctx.getBean("employee");
		empObj.setName("SRajesh");

		serviceObj = (IService) ctx.getBean("serviceImpl");
		serviceObj.greetHallo();

	}
}
