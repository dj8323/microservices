package com.funactional;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		//Checking conditions,Accept 1 and return true/false
	
	Predicate<String> str=s -> s.equals("dj"); 
	
 System.out.println(str.test("dj"));
}
}
