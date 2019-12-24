package org.mitesh.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
	//@Before("execution(public String org.mitesh.aopdemo.model.Circle.getName())")
	
	//execution of advice before any method which has get as initials
	//and any return type
/*	@Before("execution(public * get*())")
	public void LoggingAdvice()
	{
		System.out.println("Advice run. getMethod() called");
	}
	
	@Before("execution(public * get*())")
	public void secondAdvice()
	{
		System.out.println("Advice run. getMethod() called");
	}*/
	
	
	//Execution of advice using Pointcuts
	@Before("allCircleClassmethods()")
	public void LoggingAdvice(JoinPoint joinPoint)
	{
		
	}
	
	/*
	@Before("allCircleClassmethods()")
	public void secondAdvice()
	{
		System.out.println("second advice called");
	}*/
	
	//Chaining the Pointcuts
	/*@Before("allCircleClassmethods() && allGetters()")
	public void LoggingAdvice()
	{
		System.out.println("Advice run. getMethod() called");
	}
	
	
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("second advice called");
	}*/
	
	@Before("args(name)")
	public void stringArguementMethods(String name)
	{
		System.out.println("A method that takes String arguement is called. Value is: " + name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	//Pointcut for all methods in Circle class
	@Pointcut("within(org.mitesh.aopdemo.model.Circle)")
	public void allCircleClassmethods() {}
}
