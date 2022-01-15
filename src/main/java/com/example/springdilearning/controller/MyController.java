package com.example.springdilearning.controller;

import com.example.springdilearning.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
