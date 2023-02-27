package com.barclays.practice.DIAssignment.services;

import com.barclays.practice.DIAssignment.controllers.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImpl1Test {

    @Autowired
    FauxController fauxController;

    @Test
    void provideUserService() {
        System.out.println(fauxController.performAction());
    }
}