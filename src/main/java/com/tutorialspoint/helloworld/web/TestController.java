package com.tutorialspoint.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model,
                       @RequestParam(value="name", required=false, defaultValue = "friend") String name,
                       @RequestParam(value="int1", required=false, defaultValue = "1") int int1,
                       @RequestParam(value = "int2", required = false, defaultValue = "1") int int2) {
        model.addAttribute("name", name);
        model.addAttribute("total", int1+int2);
        return "test";
    }

}
