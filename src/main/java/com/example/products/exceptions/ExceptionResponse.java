package com.example.products.exceptions;


public class ExceptionResponse {
	private String exceptionMessage;
	private String requestURI;
	public ExceptionResponse(String exceptionMessage, String requestURI) {
		this.exceptionMessage = exceptionMessage;
		this.requestURI = requestURI;
	}
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	public String getRequestURI() {
		return requestURI;
	}
	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}
}
