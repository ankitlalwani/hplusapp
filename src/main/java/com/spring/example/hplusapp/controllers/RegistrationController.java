package com.spring.example.hplusapp.controllers;

import com.spring.example.hplusapp.beans.User;
import com.spring.example.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(new SimpleDateFormat("mm-dd-yyyy"), true));
    }

    @PostMapping("/registeruser")
    public String toRegisterUser(@Valid @ModelAttribute("newUser") User user, BindingResult bindingResult, Model model){
        System.out.println("in Registration Controller");
        System.out.println(user.getDateOfBirth());
        if(bindingResult.hasErrors()){
            return "register";
        }

        userRepository.save(user);

        model.addAttribute("dataSaved","User Registered Successfully");

        return "login";
    }
}
