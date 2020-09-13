package com.onslearning.cloudservice.Service;

import com.onslearning.cloudservice.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getUserName() {
        return "Sagar";
    }

    @Override
    public int getUserAge() {
        return 10;
    }
}
