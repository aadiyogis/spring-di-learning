package com.example.springdilearning.controller;

import com.example.springdilearning.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String greeting() {
        return greetingService.sayGreeting();
    }
}
