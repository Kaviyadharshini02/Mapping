package com.kaviya.OneToOne.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Error> handleStudentNotFoundException(EmployeeNotFoundException ex)
    {
        Error error = new Error();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimeStap(new Date());
        return new ResponseEntity<Error>(error , HttpStatus.NOT_FOUND);
    }
}

