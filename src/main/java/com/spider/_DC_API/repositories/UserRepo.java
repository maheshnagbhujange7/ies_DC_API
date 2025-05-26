package com.spider._DC_API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spider._DC_API.entities.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Long> {

	@Query("update UserEntity set accStatus=:status where userId=:userId")
    public Integer updateAccStatus(Integer userId, String status);

    public UserEntity findByEmail(String email);

    public UserEntity findByEmailAndPwd(String email, String pwd);
}
