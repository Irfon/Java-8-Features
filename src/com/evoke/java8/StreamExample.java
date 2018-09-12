package com.evoke.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			myList.add(i);
		}

		Stream<Integer> stream = myList.stream();
		Stream<Integer> filter = stream.filter(p -> p > 90);

		//using lambda in forEach
		filter.forEach(p -> System.out.println("Filtered Nums = "+p));

	}
}
