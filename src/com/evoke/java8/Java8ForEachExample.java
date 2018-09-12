package com.evoke.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8ForEachExample {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		//using foreach method
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		System.out.println();
		
		//Using Java 8 forEach Method
		items.forEach((k,v) -> System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println();
		System.out.println("Itering List");
		
		List<String> listItems = new ArrayList<>();
		listItems.add("A");
		listItems.add("B");
		listItems.add("C");
		listItems.add("D");
		listItems.add("E");

		for(String item : listItems){
			System.out.println(item);
		}
		
		System.out.println();
		
		//Using Java 8 forEach Method
		listItems.forEach(item -> System.out.println(item));
		
	}
}

