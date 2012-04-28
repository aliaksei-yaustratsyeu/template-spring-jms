package com.stepbysteptopro.template.model;

import java.io.Serializable;

public class LoveLetter implements Serializable {

	private static final long serialVersionUID = 1L;

	private String to;
	private String from;
	private String message;
	
	public LoveLetter(String to, String from, String message) {
		super();
		this.to = to;
		this.from = from;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
