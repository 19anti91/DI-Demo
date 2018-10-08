package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Anti1991 on 10/7/2018
 */

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!!!!");

        return greetingService.sayGreeting();
    }
}
