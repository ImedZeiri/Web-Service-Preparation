package com.example.webservicerevision;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello ,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET,path = "/greeting")
    Greeting greeting(@RequestParam(defaultValue = "imed")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

}
