package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {
	
	private int status;
	private String message;
	private int timestamp;
	
	public CustomerErrorResponse() {
		
	}
	
	public CustomerErrorResponse(int status, String message, int timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
