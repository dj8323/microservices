package com.lcwd.hotel.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
	
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	

}
