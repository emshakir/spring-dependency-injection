package com.ccube.springdi.controller;

import com.ccube.springdi.service.GreetUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class WithQualifierUsingConstructorDi {

    private final GreetUserService greetUserService;

    public WithQualifierUsingConstructorDi(@Qualifier("greetClientServiceImpl") GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings() {
        return greetUserService.greetUserDI() + " using Constrictor Dependency Injection...!!";
    }
}
