package com.spring.example.hplusapp.controllers;

import com.spring.example.hplusapp.beans.Login;
import com.spring.example.hplusapp.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultModelAttributeControllers {

    @ModelAttribute("newUser")
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
    }
}
