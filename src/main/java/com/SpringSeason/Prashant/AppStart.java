package com.SpringSeason.Prashant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class AppStart {
    public static void main(String[] args){
        System.out.println("Application Started...");

//        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//
//        Engine engine1 = context.getBean("engine1",Engine.class);
//        engine1.engineStart();
//        Car car1 = context.getBean("car1",Car.class);
//        car1.CarStart();
          ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class) {
          };
          Ram ram = (Ram) context.getBean("ram");
          Computer computer = (Computer) context.getBean("computer");
          computer.computerStart();

    }
}
