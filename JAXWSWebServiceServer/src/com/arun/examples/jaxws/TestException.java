package com.arun.examples.jaxws;

import javax.xml.ws.WebFault;

@WebFault
public class TestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6945085694582104561L;

	private String faultMessage;
	private int faultCode;

	public TestException(String faultMessage, int faultCode) {
		super();
		this.faultMessage = faultMessage;
		this.faultCode = faultCode;
	}

	public TestException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TestException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TestException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestException [faultMessage=" + faultMessage + ", faultCode=" + faultCode + "]";
	}
	
	

}
