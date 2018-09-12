package com.evoke.java8;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		//Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+time);

		//Creating LocalTime by providing input arguments
		LocalTime specificTime = LocalTime.of(12,20,25,40);
		System.out.println("Specific Time of Day="+specificTime);
	}

}
