package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* org.example.Bean1.*(..))")
    public void beforeAdvice() {
        System.out.println("Executing before advice...");
    }

    @After("execution(* org.example.Bean2.*(..))")
    public void afterAdvice() {
        System.out.println("Executing after advice...");
    }

    @Pointcut("execution(* org.example.Bean1.*(..))")
    public void bean1Execution() {}

    @Pointcut("execution(* org.example.Bean2.*(..))")
    public void bean2Execution() {}

}
