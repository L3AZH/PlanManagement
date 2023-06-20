package com.l3azh.planmanagement.user.planmanagement_user.repository;

import com.l3azh.planmanagement.user.planmanagement_user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<String, UserEntity> {
    void createNewUser();
}
