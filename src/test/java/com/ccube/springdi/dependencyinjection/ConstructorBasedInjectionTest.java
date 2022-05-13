package com.ccube.springdi.dependencyinjection;

import com.ccube.springdi.service.GreetUserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedInjectionTest {

    public ConstructorBasedInjection controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorBasedInjection(new GreetUserServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}