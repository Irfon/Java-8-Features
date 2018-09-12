package com.evoke.java8.optional;

public class Address {
	
	private Street street;
	
	public Address() {
		
	}
	public Address(Street street) {
		this.street = street;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

}
