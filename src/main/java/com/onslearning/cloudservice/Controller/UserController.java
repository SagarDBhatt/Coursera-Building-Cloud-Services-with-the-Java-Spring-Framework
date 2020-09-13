package com.onslearning.cloudservice.Controller;

import com.onslearning.cloudservice.Entity.User;
import com.onslearning.cloudservice.Service.UserService;
import com.onslearning.cloudservice.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowired")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAutoWired(){
        return "User Name = " + userService.getUserName() + " Age = " + userService.getUserAge();
    }

}
