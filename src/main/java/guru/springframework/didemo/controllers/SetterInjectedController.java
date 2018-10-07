package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by Anti1991 on 10/7/2018
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
