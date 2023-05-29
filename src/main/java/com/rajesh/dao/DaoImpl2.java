package com.rajesh.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("dao2")
public class DaoImpl2 implements IDao {

	@Override
	public String login() {
		 System.out.println("login 2 ");
		return "Login2";
	}

}
