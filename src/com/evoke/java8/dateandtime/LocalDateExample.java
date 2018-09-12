package com.evoke.java8.dateandtime;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate now, bDate, nowPlusMonth;
		now = LocalDate.now(); //Prints the current date in YYYY-MM-DD format
		
		System.out.println("Current Date is: "+now);
		
		bDate = LocalDate.of(1995, 5, 23);
		
		System.out.println("Java's bdate is: "+bDate);
		
		System.out.println("Is Java's bdate is in the past?: "+bDate.isBefore(now));
		
		System.out.println("Is Java's bdate is in the leap year? : "+bDate.isLeapYear());

		System.out.println("Java's bdate of the week: "+bDate.getDayOfWeek());
		
		nowPlusMonth = now.plusMonths(1);
		System.out.println("Adding one month to current date: "+nowPlusMonth);
	}

}
