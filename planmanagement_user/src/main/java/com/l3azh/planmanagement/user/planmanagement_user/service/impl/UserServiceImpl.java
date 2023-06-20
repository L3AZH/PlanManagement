package com.l3azh.planmanagement.user.planmanagement_user.service.impl;

import com.l3azh.planmanagement.user.planmanagement_user.dto.CreateUserRequest;
import com.l3azh.planmanagement.user.planmanagement_user.repository.UserRepository;
import com.l3azh.planmanagement.user.planmanagement_user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createNewUser(CreateUserRequest createUserRequest) {

    }
}
