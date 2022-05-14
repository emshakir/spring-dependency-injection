package com.ccube.springdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetPrimaryUserServiceImpl implements GreetUserService{
    @Override
    public String greetUser() {
        return null;
    }

    @Override
    public String greetUserDI() {
        return "Hello World from Primary User for Default greetings!!";
    }
}
