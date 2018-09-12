package com.evoke.java8;

//It it a functional interface. This interface will have only one abstract method. It can have any number of default methods.
@FunctionalInterface
public interface Interface1 {

	void method1(String str);
	
	//default method
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
}