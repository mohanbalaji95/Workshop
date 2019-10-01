package com.miraclesoft.io.ExceptionHandler;

public class PatientIdMismatchException extends RuntimeException {
	  public PatientIdMismatchException() {
	        super();
	    }

	    public PatientIdMismatchException(final String message, final Throwable cause) {
	        super(message, cause);
	    }

	    public PatientIdMismatchException(final String message) {
	        super(message);
	    }

	    public PatientIdMismatchException(final Throwable cause) {
	        super(cause);
	    }
}
