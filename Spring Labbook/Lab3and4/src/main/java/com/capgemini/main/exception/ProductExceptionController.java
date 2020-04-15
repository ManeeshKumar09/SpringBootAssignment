package com.capgemini.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.main.exception.ProductException;
import com.capgemini.main.exception.UserException;

@RestControllerAdvice
public class ProductExceptionController 
{

	@ExceptionHandler(value = ProductException.class)
	public ResponseEntity<Object> handleException(ProductException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = UserException.class)
	public ResponseEntity<Object> handleException1(UserException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.FORBIDDEN);
	}

}
