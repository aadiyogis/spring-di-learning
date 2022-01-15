package com.example.springdilearning.configuration;

import com.example.springdilearning.service.ConstructorGreetingServiceImpl;
import com.example.springdilearning.service.I18nEnglishGreetingServiceImpl;
import com.example.springdilearning.service.I18nHindiGreetingServiceImpl;
import com.example.springdilearning.service.PrimaryGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
        return new ConstructorGreetingServiceImpl();
    }

    @Primary
    @Bean
    public PrimaryGreetingServiceImpl primaryGreetingServiceImpl() {
        return new PrimaryGreetingServiceImpl();
    }

    @Profile({"HN","default"})
    @Bean("i18nservice")
    public I18nHindiGreetingServiceImpl i18nHindiGreetingService() {
        return new I18nHindiGreetingServiceImpl();
    }

    @Profile("EN")
    @Bean
    public I18nEnglishGreetingServiceImpl i18nEnglishGreetingService() {
        return new I18nEnglishGreetingServiceImpl();
    }
}
