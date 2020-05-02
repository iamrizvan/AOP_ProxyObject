package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.config.MyConfig;
import org.studyeasy.machine.Machine;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		ElectricCar cars = context.getBean("electricCar", ElectricCar.class);
		cars.run();
		context.close();

	}

}
