package com.onslearning.cloudservice.Service;

import com.onslearning.cloudservice.Entity.User;

public interface UserService {

    public User getUsers();
    public int getUserAge(String userName);

}
