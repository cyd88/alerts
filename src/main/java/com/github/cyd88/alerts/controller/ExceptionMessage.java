package com.github.cyd88.alerts.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionMessage {

    private Date time;
    private String message;
}
