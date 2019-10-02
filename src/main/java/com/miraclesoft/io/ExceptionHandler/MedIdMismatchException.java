package com.miraclesoft.io.ExceptionHandler;

public class MedIdMismatchException extends RuntimeException {
	
	public MedIdMismatchException() {
        super();
    }

    public MedIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MedIdMismatchException(final String message) {
        super(message);
    }

    public MedIdMismatchException(final Throwable cause) {
        super(cause);
    }

}
