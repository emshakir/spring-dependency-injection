package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyBasedInjectionTest {

    public PropertyBasedInjection controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyBasedInjection();
        controller.greetUser = new GreetUserServiceImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}