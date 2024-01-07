package com.kaviya.OneToOne.Exception;
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message)
    {
        super(message);
    }
}
