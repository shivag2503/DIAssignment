package com.barclays.practice.DIAssignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UserServiceImpl3 implements UserService {

    @Override
    public String provideUserService() {
        return "Hello I am from UAT environment";
    }
}
