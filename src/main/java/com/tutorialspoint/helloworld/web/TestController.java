package com.tutorialspoint.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model, @RequestParam(value="name", required=false, defaultValue = "friend") String name) {
        model.addAttribute("name", name);
        return "test";
    }

}
