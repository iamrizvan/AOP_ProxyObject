package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.config.MyConfig;
import org.studyeasy.machine.Machine;
import org.studyeasy.objects.Battery;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		ElectricCar cars = context.getBean("electricCar", ElectricCar.class);
		cars.recharge(new Battery());
		context.close();

	} 

}
