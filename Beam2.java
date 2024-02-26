package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean2 {
    @Value("Hello, world!")
    private String value;

    // init method
    @PostConstruct
    public void init() {
        System.out.println("Bean2 initialized");
    }

    // destroy method
    @PreDestroy
    public void destroy() {
        System.out.println("Bean2 destroyed");
    }

    // Getter
    public String getValue() {
        return value;
    }
}
