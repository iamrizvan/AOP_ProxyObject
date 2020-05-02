package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

//	@Pointcut("target(org.studyeasy.cars.PetrolCar)")
	@Pointcut("target(org.studyeasy.machine.Machine)")
	public void targetPointcut() {};
	
	@Before("targetPointcut()")
	public void targetAdvice()
	{
	System.out.println("target advice message");	
	}

	@Pointcut("this(org.studyeasy.cars.PetrolCar)")
	public void thisPointcut() {}
	
	@Before("thisPointcut()")
	public void thisAdvice()
	{
	System.out.println("this advice message");	
	}
	
	
}
