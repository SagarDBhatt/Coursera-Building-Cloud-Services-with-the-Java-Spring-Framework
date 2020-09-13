package com.onslearning.cloudservice;

import com.onslearning.cloudservice.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudServiceWithSpring {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceWithSpring.class, args);
    }

}
