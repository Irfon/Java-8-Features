package com.evoke.java8.dateandtime;

import java.time.*;
import static java.time.Month.*;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now(); //Prints the current date in YYYY-MM-DD format
		
		System.out.println("Current Date is: "+now);
		
		LocalDateTime startDate = LocalDateTime.of(2015, JANUARY, 15, 5, 30);
		System.out.println("Start Date is: "+startDate);
		
	}

}
