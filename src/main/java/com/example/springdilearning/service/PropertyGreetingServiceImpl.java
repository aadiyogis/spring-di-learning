package com.example.springdilearning.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Property !!!!";
    }
}
