package com.miraclesoft.io.ExceptionHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	 public RestExceptionHandler() {
	        super();
	    }
	 
	 @ExceptionHandler(MedicationNotFoundException.class)
	    protected ResponseEntity<Object> handleNotFound(Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, "Medication not found", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	    }

	    @ExceptionHandler(MedIdMismatchException.class)
	    public ResponseEntity<Object> handleBadRequest(Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, "Updated Id must be same", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	    }

}
