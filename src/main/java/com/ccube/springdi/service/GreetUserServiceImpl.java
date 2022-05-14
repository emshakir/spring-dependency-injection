package com.ccube.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetUserServiceImpl implements GreetUserService {
    @Override
    public String greetUser() {
        return "Hello World!!";
    }

    public String greetUserDI() {
        return "Hello World,";
    }
}
