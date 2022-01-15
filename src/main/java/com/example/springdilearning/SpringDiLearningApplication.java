package com.example.springdilearning;

import com.example.springdilearning.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiLearningApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDiLearningApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        String msg = myController.helloWorld();
        System.out.println(msg);

        System.out.println("______________________ controllers");

        System.out.println("PRoperty---------------------------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.greeting());

        System.out.println("Setter------------------------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.greeting());

        System.out.println("Constructor--------------------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.greeting());

        System.out.println("I18NController -----------------------");
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());
    }

}
