package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by Anti1991 on 10/7/2018
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
