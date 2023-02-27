package com.barclays.practice.DIAssignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class UserServiceImpl1 implements UserService {

    @Override
    public String provideUserService() {
        return "Hello I am from dev environment";
    }
}
