package com.SpringSeason.Prashant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.SpringSeason.Prashant")
public class ConfigClass {
    @Bean
    public CPU cpu() {
        return new CPU();
    }
}
