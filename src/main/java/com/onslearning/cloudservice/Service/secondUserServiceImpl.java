package com.onslearning.cloudservice.Service;

import org.springframework.stereotype.Service;

@Service
public class secondUserServiceImpl implements UserService{


    @Override
    public String getUserName() {
        return "Second class implements UserService";
    }

    @Override
    public int getUserAge() {
        return 40;
    }
}
