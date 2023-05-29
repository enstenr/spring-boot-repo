package com.rajesh.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("dao1")
public class DaoImpl implements IDao {

	@Override
	public String login() {
		 System.out.println(" inside login ");
		return "login";
	}

}
