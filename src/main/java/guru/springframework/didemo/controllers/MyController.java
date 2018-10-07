package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Anti1991 on 10/7/2018
 */

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!!!!");

        return "foo";
    }
}
