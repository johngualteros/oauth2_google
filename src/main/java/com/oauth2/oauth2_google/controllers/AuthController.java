package com.oauth2.oauth2_google.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String helloWorld(){
        return "hello World";
    }

    @GetMapping("/restrcited")
    public String restricted(){
        return "if you see this you already login successfully";
    }
}
