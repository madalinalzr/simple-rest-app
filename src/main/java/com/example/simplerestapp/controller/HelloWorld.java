package com.example.simplerestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, Endavians!";
    }

    @GetMapping("/thx")
    public String sayThankYou(){
        return "Thank you for attending this session!";
    }
}
