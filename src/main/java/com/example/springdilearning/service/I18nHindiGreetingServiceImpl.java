package com.example.springdilearning.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"HN", "default"})
//@Service("i18nservice")
public class I18nHindiGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Namaste !!! ";
    }
}
