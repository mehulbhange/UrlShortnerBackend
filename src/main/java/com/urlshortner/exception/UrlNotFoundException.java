package com.urlshortner.exception;

public class UrlNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public UrlNotFoundException() {
		super();
	}
	
	public UrlNotFoundException(String msg) {
		super(msg);
	}
	
	public UrlNotFoundException(Throwable cause) {
		super(cause);
	}
}
