package com.funactional;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input → Output conversion.
		
		Function<Integer, String> fun =i -> i + i+"";
		
		System.out.println(fun.apply(10));
		

	}

}
