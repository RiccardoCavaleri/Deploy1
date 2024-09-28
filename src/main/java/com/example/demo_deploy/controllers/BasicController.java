package com.example.demo_deploy.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @Value("${devName}")
    private String devName;

    @GetMapping("/dev-name")
    public String getName(){
        return devName;
    }
}
