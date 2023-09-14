package com.example.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class RequestHandler {

    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object responseObject
    ) {
        Map<String,Object> response=new HashMap<>();
        response.put("MetaData",responseObject);
        response.put("Message",message);
        response.put("HttpStatus",httpStatus);
        return new ResponseEntity<>(response,httpStatus);
    }
}
