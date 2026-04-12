package com.first.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Before("execution (* com.first.services.ProductService.createProduct())")
    public  void greeting(){
        System.out.println("hello greeting");
    }

    @After("execution(* com.first.services.ProductService.createProduct())")
    public void logout(){
        System.out.println("hello logout");

    }
}
