package com.example.demo.Exception;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException.NotAcceptable;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class ExceptionHandling extends RuntimeException{
	@ExceptionHandler(value=NoSuchElementException.class)
	public  ResponseEntity<String> elementnotfound(NoSuchElementException e){
		return new ResponseEntity<String>("no element found",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(value=EmptyStackException.class)
	public ResponseEntity<String> exception(EmptyStackException e){
		return new ResponseEntity<String>("No data entered",HttpStatus.NOT_ACCEPTABLE);
	}

}
