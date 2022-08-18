package com.zee.Spring_Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("aopbean.xml");
    	Business b = context.getBean("business", Business.class);
    	b.BusinessLogic();
//    	LoggingActivity la = context.getBean("log", LoggingActivity.class);
//    	la.log();
    }
}
