package com.urlshortner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.urlshortner.entity.UrlExceptionResponse;

@ControllerAdvice
public class UrlExceptionController {
	
	@ExceptionHandler(UrlNotFoundException.class)
	//UrlExceptionResponse
	public ResponseEntity<UrlExceptionResponse> urlNotFoundException(UrlNotFoundException exception){
		
		UrlExceptionResponse error = new UrlExceptionResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	

}
