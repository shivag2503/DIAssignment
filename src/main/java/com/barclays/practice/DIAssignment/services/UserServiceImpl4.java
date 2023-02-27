package com.barclays.practice.DIAssignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class UserServiceImpl4 implements UserService {

    @Override
    public String provideUserService() {
        return "Hello I am from production environment";
    }
}
