package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	//@Pointcut("bean(petrolCar)")
	@Pointcut("bean(*Car)")
	public void beanPointcut() {};
	
	@Before("beanPointcut()")
	public void beanAdvice()
	{
	System.out.println("bean pointcut advice message");	
	}

	
	
}
