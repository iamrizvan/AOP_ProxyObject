package org.studyeasy.cars;

import org.studyeasy.machine.Machine;

public class PetrolCar implements Machine {
	@Override
	public void run() {
		System.out.println("Petrol car is running on the road.");
	}
	
	@Override
	public void run(int speed) {
		System.out.println("Petrol car is runnnig at speed "+speed+" km/hr");
	}
	
	@Override
	public void run(int speed, int hour) {
		System.out.println("Petrol car is runnnig at speed "+speed+" km/hr, for "+hour+" hours" );
	}
	
	@Override
	public String run(String sexy) {
		System.out.println("Petrol car is "+sexy);
		return "GOA";
	}
	
	@Override
	public String run(int rank, String sexy) {
		System.out.println("Petrol car is "+sexy+" which posses the rank # "+rank);
		return "GOA";
	}
	
	@Override
	public String run(int rank, String sexy, int speed) {
		System.out.println("Petrol car is "+sexy+" which posses the rank # "+rank+" this is known for its highest speed of :"+speed+
				"km/hr");
		return "GOA";
	}
}
