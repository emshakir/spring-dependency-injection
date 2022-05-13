package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedInjectionTest {

    public SetterBasedInjection controller;
    @BeforeEach
    void setUp() {
        controller = new SetterBasedInjection();
        controller.setGreetUserService(new GreetUserServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}