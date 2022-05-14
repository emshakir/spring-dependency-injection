package com.ccube.springdi.controller;

import com.ccube.springdi.service.GreetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class WithQualifierUsingSetterDi {

    private GreetUserService greetUserService;


    @Autowired
    @Qualifier("greetClientServiceImpl")
    public void setGreetUserService(GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings() {
        return greetUserService.greetUserDI() + " using Setter Dependency Injection...!!";
    }
}
