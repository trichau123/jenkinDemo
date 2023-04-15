package com.example.jenkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {

    @GetMapping("/welcome")
    public String welcomeJenkin(){
        return "Welcome to jenkin";
    }
    public static void main(String[] args) {
        SpringApplication.run(JenkinDemoApplication.class, args);
    }

}
