package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserService;

public class SetterBasedInjection {

    private GreetUserService greetUserService;

    public void setGreetUserService(GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings(){
        return greetUserService.greetUser();
    }
}
