package com.onslearning.cloudservice.Service;

import com.onslearning.cloudservice.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class UserServiceImpl implements UserService {

    User aUser;

    @Override
    public User getUsers() {
        aUser = new User("Sagar", 25, "Denver");
        return aUser;
    }

    @Override
    public int getUserAge(String userName) {
        if(aUser.getName() == userName)
            return aUser.getAge();
        else
            return 0;
    }
}
