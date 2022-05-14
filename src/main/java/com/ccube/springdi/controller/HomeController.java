package com.ccube.springdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String greetUser(){
        return "Hello World!";
    }
}
