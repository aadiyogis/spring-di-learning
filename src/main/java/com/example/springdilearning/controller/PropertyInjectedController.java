package com.example.springdilearning.controller;

import com.example.springdilearning.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String greeting() {
        return greetingService.sayGreeting();
    }
}
