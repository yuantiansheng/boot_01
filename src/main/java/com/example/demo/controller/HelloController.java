package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String index() {
        System.out.println("Greetings from Spring Boot!");
        return "Greetings from Spring Boot!";
    }

}
