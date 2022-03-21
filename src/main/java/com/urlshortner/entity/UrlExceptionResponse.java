package com.urlshortner.entity;

import lombok.Data;

@Data
public class UrlExceptionResponse {
	
	private int status;
	private String message;
	private long timeStamp;

}
