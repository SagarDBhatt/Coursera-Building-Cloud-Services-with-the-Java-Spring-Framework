package com.onslearning.cloudservice.Controller;

import com.onslearning.cloudservice.Entity.User;
import com.onslearning.cloudservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public void getUsers(){
        System.out.println(userService.getUsers());
    }

    public void getUserAge(){
        System.out.println(userService.getUserAge("Sagar"));
    }
}
