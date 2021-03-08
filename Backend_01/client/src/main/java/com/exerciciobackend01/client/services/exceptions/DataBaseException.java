package com.exerciciobackend01.client.services.exceptions;

public class DataBaseException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataBaseException(String msg) {
		super(msg);
	}
	
}
