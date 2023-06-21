package com.example.urlmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("something"," one day");
        return "welcome";
    }
    @GetMapping("/greet")
    public String greeting(Model model){
        model.addAttribute("tagline","Hello  welcome from JDC");
        return "welcome";
    }
    @GetMapping("/sayspring")
    public String saySpring(Model model){
        model.addAttribute("tagline","Say Spring MVC");
        return "welcome";
    }
    @GetMapping({"/","/home"})
    public String welcome(Model model){
        model.addAttribute("tagline","Welcome Spring MVC");
        return "welcome";
    }
}
