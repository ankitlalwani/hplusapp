package com.spring.example.hplusapp.restcontroller;

import com.spring.example.hplusapp.beans.Login;
import com.spring.example.hplusapp.beans.User;
import com.spring.example.hplusapp.exceptions.LoginFailureException;
import com.spring.example.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.FailedLoginException;

@RestController
public class LoginRestController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/hplus/rest/loginuser")
    public ResponseEntity loginUser(@RequestBody Login login) throws LoginFailureException{
        System.out.println(login.getUsername());
        User user = userRepository.searchByName(login.getUsername());

        if (user==null){
//            return ResponseEntity.status(404).build();
            return new ResponseEntity<>("user not found",HttpStatus.NOT_FOUND);
        }

        if ((user.getUsername().equals(login.getUsername())) &&
        user.getPassword().equals(login.getPassword())){
            return new ResponseEntity<>("Welcome "+user.getUsername(),HttpStatus.OK);
        }
        else {
            throw new LoginFailureException("Invalid Username or password");

        }
    }
}
