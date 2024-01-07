package com.kaviya.OneToOne.Exception;

import lombok.Data;

import java.util.Date;

@Data
public class Error {
    private Integer statusCode;
    private String message;
    private Date timeStap;
}

