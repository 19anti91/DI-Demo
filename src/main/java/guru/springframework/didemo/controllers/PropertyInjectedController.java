package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Anti1991 on 10/7/2018
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    @Qualifier("setterGreetingService")
    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
