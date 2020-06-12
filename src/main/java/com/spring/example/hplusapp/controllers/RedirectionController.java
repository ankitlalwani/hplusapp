package com.spring.example.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {

    @GetMapping("redirectToLinkedin")
    public String redirectLinkedin(){
        System.out.println("redirecting to linkedin page");
        return "redirect:https://www.linkedin.com/in/ankit-lalwani/";
    }
}
