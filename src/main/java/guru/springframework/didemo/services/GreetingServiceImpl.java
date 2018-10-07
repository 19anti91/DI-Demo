package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Anti1991 on 10/7/2018
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
