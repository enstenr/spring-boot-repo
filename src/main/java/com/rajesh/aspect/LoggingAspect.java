package com.rajesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void afterReturn(Object returnValue) throws Throwable {
		logger.info("value return was {}", returnValue);
	}

	@Before(value = "execution(* com.rajesh.*.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println(
				"Creating Employee with first name - "  + ", second name - " +  " and id - " );
	}
}
