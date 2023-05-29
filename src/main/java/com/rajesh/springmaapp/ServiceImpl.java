package com.rajesh.springmaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//@Configuration
public class ServiceImpl implements IService {

	@Override
	public void greetHallo() {
		 System.out.println(" Greet Hallo ");
		 System.out.println(empObj.getName());

	}
	@Autowired
	private Employee empObj;
	
	
	private Employee getEmployee() {
		return empObj;
	}

}
