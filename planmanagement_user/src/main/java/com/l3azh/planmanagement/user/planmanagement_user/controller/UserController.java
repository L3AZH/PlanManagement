package com.l3azh.planmanagement.user.planmanagement_user.controller;

import com.l3azh.planmanagement.user.planmanagement_user.dto.CreateUserRequest;
import com.l3azh.planmanagement.user.planmanagement_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createNewUser")
    public void createNewUser(@RequestBody CreateUserRequest request){
        userService.createNewUser(request);
    }
}

