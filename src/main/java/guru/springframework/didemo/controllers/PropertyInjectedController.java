package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by Anti1991 on 10/7/2018
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }


}
