package com.spring.example.hplusapp.controllers;

import com.spring.example.hplusapp.beans.Login;
import com.spring.example.hplusapp.beans.Product;
import com.spring.example.hplusapp.beans.User;
import com.spring.example.hplusapp.exceptions.ApplicationException;
import com.spring.example.hplusapp.repository.ProductRepository;
import com.spring.example.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("login")
public class LoginController {


    @Autowired
    UserRepository userRepository;


    @PostMapping("/login")
    public String doLogin(@ModelAttribute("login")Login login){

        User user = userRepository.searchByName(login.getUsername());

        if (user==null){
            throw new ApplicationException("User not found");
        }
        if (user.getUsername().equals(login.getUsername())&&
                user.getPassword().equals(login.getPassword())){
            System.out.println("usernanme: "+ user.getUsername());
            System.out.println("username: " +login.getUsername());
            System.out.println("usernanme: "+ user.getPassword());
            System.out.println("usernanme: "+ login.getPassword());

        }else {
            throw new ApplicationException("Wrong Username or Password");
        }

        return "forward:/userprofile";
    }

    /*@ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of login controller");
        return "error";
    }*/
}
