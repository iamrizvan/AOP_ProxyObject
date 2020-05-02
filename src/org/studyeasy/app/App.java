package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.config.MyConfig;
import org.studyeasy.machine.Machine;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Machine cars = context.getBean("petrolCar", Machine.class);
		cars.run();
		context.close();

	}

}
