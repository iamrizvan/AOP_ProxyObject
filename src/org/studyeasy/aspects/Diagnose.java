package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Pointcut("execution(void run(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void beforeAdvice()
	{
	System.out.println("Before advice message");
		
	}

	
}
