package com.first.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {

    @Around("execution(* com.first.controller.*.*(..))")
    public Object measureExecutiomnTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //calculate time
        long start = System.currentTimeMillis();

        //this is reference if you write bussiness logic above it
       Object result =  joinPoint.proceed(); // <---- joinPoint
        //joinPoint.Proceed() lets the function to run

        Long end = System.currentTimeMillis();
        //after
        System.out.println("The time taken by process to run" + (end-start) + "ms");

        return null;
    }

}
