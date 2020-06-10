package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/hello")
    public String welcome(Model model){
        model.addAttribute("tagline","Spring MVC");
        return "welcome";
    }


}
