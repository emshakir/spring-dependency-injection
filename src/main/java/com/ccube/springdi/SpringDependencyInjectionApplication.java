package com.ccube.springdi;

import com.ccube.springdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        HomeController homeController = (HomeController) context.getBean("homeController");
        System.out.println(homeController.greetUser());

        WithQualifierUsingFieldDi greetUserUsingFieldDI = (WithQualifierUsingFieldDi) context.getBean("withQualifierUsingFieldDi");
        System.out.println(greetUserUsingFieldDI.getGreetings());

        WithQualifierUsingSetterDi withQualifierUsingSetterDi = (WithQualifierUsingSetterDi) context.getBean("withQualifierUsingSetterDi");
        System.out.println(withQualifierUsingSetterDi.getGreetings());

        WithQualifierUsingConstructorDi withQualifierUsingConstructorDi = (WithQualifierUsingConstructorDi) context.getBean("withQualifierUsingConstructorDi");
        System.out.println(withQualifierUsingConstructorDi.getGreetings());

        WithPrimaryForDefaultLoad withPrimaryForDefaultLoad = (WithPrimaryForDefaultLoad) context.getBean("withPrimaryForDefaultLoad");
        System.out.println(withPrimaryForDefaultLoad.getGreetings());

        I18NController i18nController = (I18NController) context.getBean("i18NController");
        System.out.println(i18nController.getGreetings());

        PetController petController = (PetController) context.getBean("petController");
        System.out.println(petController.getPetType());


    }

}
