package com.evoke.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumberTest {
	
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}

	public static void main(String[] args) {
		//sum of all numbers
		System.out.println(sumWithCondition(Arrays.asList(1,2,3,4,5,6), n -> true));
		
		//sum of all even numbers
		System.out.println(sumWithCondition(Arrays.asList(1,2,3,4,5,6), i -> i%2 == 0));
		
		//sum of all numbers greater than 5
		System.out.println(sumWithCondition(Arrays.asList(1,2,3,4,5,6), i -> i>5));
	}
}
