package com.ccube.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class WithProfileForGreetingInSpanish implements GreetUserService{
    @Override
    public String greetUser() {
        return null;
    }

    @Override
    public String greetUserDI() {
        return "Hola Mundo - ES(Spanish)";
    }
}
