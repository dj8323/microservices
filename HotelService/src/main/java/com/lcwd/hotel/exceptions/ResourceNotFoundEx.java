package com.lcwd.hotel.exceptions;

public class ResourceNotFoundEx  extends RuntimeException{

	public ResourceNotFoundEx() {
		// TODO Auto-generated constructor stub
		super("Resource not Found..!!!!!!");
	}
	public ResourceNotFoundEx(String s)
	{
		super(s);
	}
}
