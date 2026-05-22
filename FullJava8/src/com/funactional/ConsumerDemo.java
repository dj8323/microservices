package com.funactional;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
		//Consumes data but returns nothing.
		
		Consumer<String> consumer=t -> System.out.println("t="+t);
		
		consumer.accept("Dhananjay");

	}

}
