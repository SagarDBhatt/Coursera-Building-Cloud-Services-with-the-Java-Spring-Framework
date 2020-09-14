package com.onslearning.cloudservice.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
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
