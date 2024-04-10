package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ParamCheckException.class)
    public ResponseEntity<?> handleParamCheckException(ParamCheckException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.BAD_REQUEST.value());
        response.put("retCode", ex.getRetCode());
        response.put("retMessage", ex.getRetMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
