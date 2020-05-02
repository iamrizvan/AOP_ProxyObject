package org.studyeasy.machine;

public interface Machine {
	void run();

	void run(int speed);

	void run(int speed, int hour);

	String run(String sexy);

	String run(int rank, String sexy);

	String run(int rank, String sexy, int speed);
}
