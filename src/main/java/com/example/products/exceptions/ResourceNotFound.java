package com.example.products.exceptions;


public class ResourceNotFound extends Exception {

	private static final long serialVersionUID = 1L;

	public ResourceNotFound() {
		super();
	}

	public ResourceNotFound(String message) {
		super(message);
	}
}
