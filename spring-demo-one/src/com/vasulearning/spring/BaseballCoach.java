package com.vasulearning.spring;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "Do daily 30mins work out";
	}
}
