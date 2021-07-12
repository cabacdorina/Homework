package com.unicredit.homework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S {
    private static final S instance = new S();

    private S() {}

    @Bean
    public static S getInstance() {
        return instance;
    }
}
