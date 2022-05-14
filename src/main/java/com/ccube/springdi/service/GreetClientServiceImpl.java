package com.ccube.springdi.service;

import org.springframework.stereotype.Service;
import sun.java2d.opengl.OGLRenderQueue;

@Service
public class GreetClientServiceImpl implements GreetUserService{
    @Override
    public String greetUser() {
        return null;
    }

    @Override
    public String greetUserDI() {
        return "Hello World from Client Implementation, ";
    }
}
