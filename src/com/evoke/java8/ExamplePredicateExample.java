package com.evoke.java8;
import static com.evoke.java8.EmployeePredicates.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamplePredicateExample {

	 public static void main(String[] args){
	        Employee e1 = new Employee(101,23,"M","Rick","Beethovan");
	        Employee e2 = new Employee(201,13,"F","Martina","Hengis");
	        Employee e3 = new Employee(301,43,"M","Ricky","Martin");
	        Employee e4 = new Employee(401,26,"M","Jon","Lowman");
	        Employee e5 = new Employee(501,19,"F","Cristine","Maria");
	        Employee e6 = new Employee(601,15,"M","David","Feezor");
	        Employee e7 = new Employee(701,68,"F","Melissa","Roy");
	        Employee e8 = new Employee(801,79,"M","Alex","Gussin");
	        Employee e9 = new Employee(901,15,"F","Neetu","Singh");
	        Employee e10 = new Employee(1001,45,"M","Naveen","Jain");
	         
	        List<Employee> employees = new ArrayList<Employee>();
	        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
	        
	        System.out.println(filterEmployees(employees, isAdultMale()));
	         
	        System.out.println(filterEmployees(employees, isAdultFemale()));
	         
	        System.out.println(filterEmployees(employees, isAgeMoreThan(35)));
	         
	        //Employees other than above collection of "isAgeMoreThan(35)" can be get using negate()
	        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
	    }
}
