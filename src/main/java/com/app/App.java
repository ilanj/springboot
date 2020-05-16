package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.app"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);

    }
}
