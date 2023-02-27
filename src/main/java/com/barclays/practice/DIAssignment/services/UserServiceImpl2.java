package com.barclays.practice.DIAssignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class UserServiceImpl2 implements UserService {

    @Override
    public String provideUserService() {
        return "Hello I am from QA environment";
    }
}
