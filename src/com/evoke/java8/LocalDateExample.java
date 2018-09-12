package com.evoke.java8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		
		//Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date="+today);

		//Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2014);
	}

}
