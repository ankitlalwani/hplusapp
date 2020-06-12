package com.spring.example.hplusapp.controllers;

import com.spring.example.hplusapp.beans.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class UserProfileController {

    @PostMapping("/userprofile")
    public String getUserProfile(@SessionAttribute("login")Login login, Model model){
        System.out.println("in User Profile Controller");
        model.addAttribute("username",login.getUsername());
        System.out.println("Username: "+ login.getUsername());
        return "profile";
    }
}
