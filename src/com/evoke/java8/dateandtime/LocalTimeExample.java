package com.evoke.java8.dateandtime;

import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime now, lunch, nowHrsMin;
		now = LocalTime.now(); //Prints the current date in YYYY-MM-DD format
		
		System.out.println("Current Time is: "+now);
		
		lunch = LocalTime.of(12,30);
		
		System.out.println("Lunch Time is: "+lunch);
		
		nowHrsMin = now.truncatedTo(MINUTES);
		System.out.println("Lunch Time is: "+nowHrsMin);
		
	}
}
