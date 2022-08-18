package com.zee.Spring_Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingActivity {
	
	@Before("execution(public void BusinessLogic())")
	public void log()
	{
		System.out.println("store logging details..");
	}
}
