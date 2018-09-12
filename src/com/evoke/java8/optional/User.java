package com.evoke.java8.optional;

public class User {

	public Address getAddress() {
		return new Address(new Street("Street Name"));
		//return null;
	}
}
