package com.github.cyd88.alerts.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionMessage> handleAllExceptions(Exception ex) {
        log.error("Unexpected error", ex);
        ExceptionMessage exceptionMessage = new ExceptionMessage(new Date(), ex.getMessage());
        return new ResponseEntity<>(exceptionMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
