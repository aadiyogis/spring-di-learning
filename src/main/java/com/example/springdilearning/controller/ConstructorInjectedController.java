package com.example.springdilearning.controller;

import com.example.springdilearning.service.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.sayGreeting();
    }
}
