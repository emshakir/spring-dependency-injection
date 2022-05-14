package com.ccube.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class WithProfileForGreetingInEnglish implements GreetUserService{
    @Override
    public String greetUser() {
        return null;
    }

    @Override
    public String greetUserDI() {
        return "Hello World - EN";
    }
}
