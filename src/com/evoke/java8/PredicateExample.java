package com.evoke.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//A Predicate is a function which takes some value and returns either true or false
//Present in java.util.function package
public class PredicateExample {

	public static Predicate<Apple> isWeightAbove150() {
		return apple -> apple.getWeight() >= 150;
	}

	public static Predicate<Apple> isColorGreen() {
		return apple -> apple.getColor().equals("green");
	}

	public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<Apple> applesList = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
				new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));

		System.out.println("Apples whose weight is equal/above 150 gms");
		//Apples which weighs above 150
		PredicateExample.filterApples(applesList, PredicateExample.isWeightAbove150())
		.forEach(System.out::println);

		System.out.println();
		System.out.println("Apples whose colour is green");

		//Apples whose colour is green
		PredicateExample.filterApples(applesList, PredicateExample.isColorGreen())
		.forEach(System.out::println);

		System.out.println();
		System.out.println("Combining both conditions");
		Predicate<Apple> andPredicate = PredicateExample.isColorGreen().and(PredicateExample.isWeightAbove150());
		applesList.stream().filter(andPredicate).forEach(System.out::println);


		System.out.println();
		System.out.println("Apples which are not green");
		System.out.println("Calling Negate function on the existing predicate");
		Predicate<Apple> negateExample = PredicateExample.isColorGreen().negate();
		applesList.stream().filter(negateExample).forEach(System.out::println);

		System.out.println();
		System.out.println("Calling test method on the predicate for checking the condition");

		Apple testApple = new Apple("green", 120.0);
		System.out.println(PredicateExample.isColorGreen().test(testApple));
		System.out.println(PredicateExample.isWeightAbove150().test(testApple));
		System.out.println();


		Predicate<Apple> standardApplePredicate = Predicate.isEqual(new Apple("red", 150.0));
		Apple givenApple = new Apple("green", 120.0);
		System.out.println(standardApplePredicate.test(givenApple));
		System.out.println(standardApplePredicate.test(new Apple("red", 150.0)));

	}

}
