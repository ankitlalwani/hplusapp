package com.spring.example.hplusapp.controllers;


import com.spring.example.hplusapp.beans.Login;
import com.spring.example.hplusapp.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("in Home Controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("going to search page");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to search page");
        return "login";
    }
    @GetMapping("/goToRegister")
    public String goToRegister(){
        System.out.println("going to register page");
        return "register";
    }

    /*@ModelAttribute("newUser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){


        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }
    @ModelAttribute("login")
    public Login getDefaultLogin(){
        return new Login();
    }*/
}
