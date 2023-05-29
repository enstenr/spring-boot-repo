package com.rajesh.springmaapp;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@Scope("prototype")
public class Employee implements  InitializingBean {

	String name="Default";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" After setting properties");
		
	}
	
}
