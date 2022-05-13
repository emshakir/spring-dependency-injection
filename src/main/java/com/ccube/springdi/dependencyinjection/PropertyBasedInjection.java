package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserService;

public class PropertyBasedInjection {

    public GreetUserService greetUser;

    public String getGreetings(){
        return greetUser.greetUser();
    }
}
