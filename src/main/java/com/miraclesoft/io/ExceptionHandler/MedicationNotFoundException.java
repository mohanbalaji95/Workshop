package com.miraclesoft.io.ExceptionHandler;

public class MedicationNotFoundException extends RuntimeException {
	
	public MedicationNotFoundException() {
        super();
    }

    public MedicationNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MedicationNotFoundException(final String message) {
        super(message);
    }

    public MedicationNotFoundException(final Throwable cause) {
        super(cause);
    }

}
