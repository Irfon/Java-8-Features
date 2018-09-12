package com.evoke.java8;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		//Current Date
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime: "+today);

		//Creating LocalDateTime by providing input arguments
		LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
		System.out.println("Specific Date: "+specificDate);
	}

}
