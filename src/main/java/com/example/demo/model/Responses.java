package com.example.demo.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Responses {
    public static <T> ResponseEntity<ResponseBody<T>> response200OK(String msg, T data, int total) {
        return response(HttpStatus.OK, msg, data, total);
    }

    public static <T> ResponseEntity<ResponseBody<T>> response(HttpStatus status, String msg, T data, int total) {
        ResponseBody<T> body = new ResponseBody(msg, data, total);
        return new ResponseEntity(body, status);
    }



}
