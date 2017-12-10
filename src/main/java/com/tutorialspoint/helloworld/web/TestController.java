package com.tutorialspoint.helloworld.web;

import com.tutorialspoint.helloworld.models.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("test", new Test());
        return "test";
    }

    @PostMapping("/test")
    public String testSubmit(@ModelAttribute Test test) {
        return "result";
    }

}
