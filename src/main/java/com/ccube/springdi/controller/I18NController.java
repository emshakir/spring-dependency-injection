package com.ccube.springdi.controller;

import com.ccube.springdi.service.GreetUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetUserService greetUserService;

    public I18NController(@Qualifier("i18nService") GreetUserService greetUserService) {
        this.greetUserService = greetUserService;
    }

    public String getGreetings() {
        return greetUserService.greetUserDI();
    }
}
