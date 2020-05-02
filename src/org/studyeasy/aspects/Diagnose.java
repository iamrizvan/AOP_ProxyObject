package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Pointcut("args(Deprecated)")
	public void argsPointcut() {};
	
	@Before("argsPointcut()")
	public void argsAdvice()
	{
	System.out.println("args pointcut advice message");	
	}

	
	
}
