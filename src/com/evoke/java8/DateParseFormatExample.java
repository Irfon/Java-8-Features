package com.evoke.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParseFormatExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Default format of LocalDate "+date);
		
		//specific format
		System.out.println("After Formatting the date "+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

		System.out.println();

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Default format of LocalDateTime "+dateTime);
		
		//specific format
		System.out.println("After Formatting the dateTime "+dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

		System.out.println();
		
		//Parse examples
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
		DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		
		System.out.println("Default format after parsing "+dt);
	}

}
