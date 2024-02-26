package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean1 {
    private Bean2 bean2;

    @Autowired
    public Bean1(Bean2 bean2) {
        this.bean2 = bean2;
    }

    // init method
    @PostConstruct
    public void init() {
        System.out.println("Bean1 initialized");
    }

    // destroy method
    @PreDestroy
    public void destroy() {
        System.out.println("Bean1 destroyed");
    }

    // Other methods
}

