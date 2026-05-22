package com.lcwd.user.service.exception;

public class ResourceNotFound extends RuntimeException{
	
	public ResourceNotFound() {
		// TODO Auto-generated constructor stub
		super("Resource not found on server");
		
	}
	public ResourceNotFound(String message)
	{
		super(message);
	}

}
