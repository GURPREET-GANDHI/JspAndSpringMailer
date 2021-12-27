package com.example.poc.jspdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Howdy";
    }
}
