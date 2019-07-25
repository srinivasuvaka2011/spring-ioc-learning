package com.springlearning.demoone;

public class MainApp {

	public static void main(String args[]) {
		//create the object
		//BaseballCoach theCoach = new BaseballCoach();
		
		//use code to interface method
		//Coach theCoach = new BaseballCoach();
		
		Coach theCoach = new TrackCoach();
		
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
