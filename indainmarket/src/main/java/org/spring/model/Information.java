package org.spring.model;


public class Information {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Information [message=" + message + "]";
	}
	
}
