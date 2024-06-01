package com.tarea.libro.util;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandle {
    
    @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request){
		ErrorDetalle errorDetail = new ErrorDetalle();
		errorDetail.setTimeStamp(new Date(0).getTime());
		errorDetail.setStatus(HttpStatus.NOT_FOUND.value());
		errorDetail.setTitle("Libro no encontrado");
		errorDetail.setDetail(rnfe.getMessage());
		
		return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
	}
}
