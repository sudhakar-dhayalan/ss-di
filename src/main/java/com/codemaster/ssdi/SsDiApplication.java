package com.codemaster.ssdi;

import com.codemaster.ssdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SsDiApplication {

        public static void main(String[] args) {

	    ApplicationContext applicationContext = SpringApplication.run(SsDiApplication.class, args);

        PetController petController = (PetController) applicationContext.getBean("petController");
        System.out.println("------------Pet");
        System.out.println(petController.getPetSer());

        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println("-----------Greeting");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println("-----------Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-----------Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-----------Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());;

        System.out.println("----------Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


	}

}
