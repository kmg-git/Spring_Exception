package com.example.spring_exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
    @GetMapping("/a/test")
    public String test(){
        return "신기하네";
    }

    @GetMapping("/a/error")
    public String error(){
        throw new IllegalArgumentException("예외발생 비이상");
    }


}
