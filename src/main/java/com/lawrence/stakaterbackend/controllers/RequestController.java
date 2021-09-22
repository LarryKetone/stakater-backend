package com.lawrence.stakaterbackend.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class RequestController {

    @Value("${name}")
    private String name;

    @GetMapping("/main")
    public ResponseEntity<String> getName(){
        return ResponseEntity.ok("Hello " + name);
    }

}
