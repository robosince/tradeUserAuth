package com.userAuth.loginSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public String home(){
        return "Welcome to HOME page";
    }

    @GetMapping("login")
    public String login(){
        return "Welcome to LOGIN page";
    }

    @GetMapping("signup")
    public String signup(){
        return "Welcome to SIGNUP page";
    }
}
