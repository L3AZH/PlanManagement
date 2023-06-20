package com.l3azh.planmanagement.user.planmanagement_user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity {

    @Id
    @Column(name = "email", columnDefinition = "nvarchar(255)")
    private String email;
    @Column(name = "password", columnDefinition = "nvarchar(255)")
    private String password;
    @Column(name = "createdAt", columnDefinition = "datetime")
    private Date createdAt;
    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Date updatedAt;
}
