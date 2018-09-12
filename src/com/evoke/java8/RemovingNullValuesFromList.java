package com.evoke.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemovingNullValuesFromList {

	public static void main(String[] args) {
		
		Stream<String> list = Stream.of("hello", "hai", null);
		List<String> listData = list.filter(x -> x != null).collect(Collectors.toList());
		
		listData.forEach(value -> System.out.println(value));
		listData.forEach(System.out::println); // Method Reference
	}
}
