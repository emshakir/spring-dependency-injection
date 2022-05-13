package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserService;

public class ConstructorBasedInjection {

    private final GreetUserService greetUserService;

    public ConstructorBasedInjection(GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings(){
        return greetUserService.greetUser();
    }
}
