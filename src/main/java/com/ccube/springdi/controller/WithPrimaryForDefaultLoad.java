package com.ccube.springdi.controller;

import com.ccube.springdi.service.GreetUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class WithPrimaryForDefaultLoad {

    private final GreetUserService greetUserService;

    public WithPrimaryForDefaultLoad(GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings() {
        return greetUserService.greetUserDI();
    }
}
