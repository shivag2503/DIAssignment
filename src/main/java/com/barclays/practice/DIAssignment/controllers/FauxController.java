package com.barclays.practice.DIAssignment.controllers;

import com.barclays.practice.DIAssignment.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final UserService userService;


    public FauxController(UserService userService) {
        this.userService = userService;
    }

    public String performAction() {
        return userService.provideUserService();
    }
}
