package com.example.springdilearning;

import com.example.springdilearning.controller.MyController;
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
    }

}
