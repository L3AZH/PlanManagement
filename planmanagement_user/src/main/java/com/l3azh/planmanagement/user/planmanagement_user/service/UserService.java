package com.l3azh.planmanagement.user.planmanagement_user.service;

import com.l3azh.planmanagement.user.planmanagement_user.dto.CreateUserRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    void createNewUser(CreateUserRequest createUserRequest);
}
