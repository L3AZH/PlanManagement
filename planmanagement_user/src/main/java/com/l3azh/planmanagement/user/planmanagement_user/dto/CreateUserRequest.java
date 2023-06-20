package com.l3azh.planmanagement.user.planmanagement_user.dto;

import lombok.Builder;

@Builder
public class CreateUserRequest {
    private String email;
    private String password;
}
