package com.avn.tns.java8features;
//demo for lambda, stream API & data & time API

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
	interface Cal{
		int add (int a,int b);
}

public class LambdaDemo {
	public static void main(String[] args) {
		//lambda expression
		Cal c=(a,b)->a+b;
		System.out.println(c.add(23,2));
		//stream API 
		List<Integer>L=Arrays.asList(1,2,2,3,4,5);
		L.stream().distinct().forEach(System.out::println);
		//date time
		LocalDate d =LocalDate.now();
		System.out.println(d);
		LocalTime t =LocalTime.now();
		System.out.println(t);
	}

}
