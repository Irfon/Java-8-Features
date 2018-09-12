package com.evoke.java8.optional;

import java.util.Optional;

public class UsingOptional {

	//Normal Way
	public static String method1() {
		User user = new User();
		if (user != null) {
			Address address = user.getAddress();
			if (address != null) {
				Street street = address.getStreet();
				if (street != null) {
					return street.getStreetName();
				}
			}
		}
		return "not specified";
	}

	//Using Optional Class
	public static String method2() {
		Optional<User> user = Optional.ofNullable(new User());
		return user.map(User::getAddress)
		           .map(Address::getStreet)
		           .map(Street::getStreetName)
		           .orElse("not specified");
	}

	public static void main(String[] args) {
		System.out.println(method1());
		//System.out.println(method2());
	}
}
