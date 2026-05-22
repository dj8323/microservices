package com.funactional;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Returns data without input.
		
		Supplier<Double> s=() -> Math.random();

		System.out.println(s.get());
	}

}
