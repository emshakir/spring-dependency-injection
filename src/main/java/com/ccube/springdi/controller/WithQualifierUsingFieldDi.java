package com.ccube.springdi.controller;

import com.ccube.springdi.service.GreetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class WithQualifierUsingFieldDi {


    @Autowired
    @Qualifier("greetClientServiceImpl")
    public GreetUserService greetUserService;

    public String getGreetings() {
        return greetUserService.greetUserDI() + " using field Dependency Injection...!!";
    }
}
