package com.tutorialspoint.helloworld.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello, " + name +"!";
    }

    @RequestMapping("goodbye")
    public String sayGoodbye(@RequestParam(value = "name") String name) {
        return "See you later, " + name +"!";
    }
}
