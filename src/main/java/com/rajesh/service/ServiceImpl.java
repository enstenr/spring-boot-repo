package com.rajesh.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.rajesh.dao.IDao;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Service
public class ServiceImpl implements IService  , InitializingBean,
DisposableBean {
	@Autowired
	@Qualifier("dao2")
	IDao daoObj;
	
	@Override
	public String login() {
		// TODO Auto-generated method stub
		return daoObj.login();
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println(" Post construct ");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println(" pre destroy ");
	}

	 @Override
	    // It is the init() method
	    // of our bean and it gets
	    // invoked on bean instantiation
	    public void afterPropertiesSet()
	throws Exception
	    {
	        System.out.println(
	            "Bean HelloWorld has been "
	            + "instantiated and I'm the "
	            + "init() method");
	    }
	@Override
	public void destroy() throws Exception {
		 
		 System.out.println(
		            "Container has been closed "
		            + "and I'm the destroy() method");
	}
}
