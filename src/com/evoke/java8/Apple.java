package com.evoke.java8;

public class Apple {

	private String color;
	private Double weight;

	public Apple() {
		
	}
	public Apple(String c, Double w) {
		this.color = c;
		this.weight = w;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple{color: " + this.getColor() + ",weight: " + this.getWeight() + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		Apple apple = (Apple) obj;
		if (this.getColor().equals(apple.getColor()) && this.getWeight().equals(apple.getWeight())) {
			return true;
		}
		return false;
	}


}
