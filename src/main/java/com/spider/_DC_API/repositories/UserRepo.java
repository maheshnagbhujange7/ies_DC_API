package com.spider._DC_API.repositories;

import org.springframework.data.jpa.repository.Query;

import com.spider._DC_API.entities.UserEntity;


public interface UserRepo {

	@Query("update UserEntity set accStatus=:status where userId=:userId")
    public Integer updateAccStatus(Integer userId, String status);

    public UserEntity findByEmail(String email);

    public UserEntity findByEmailAndPwd(String email, String pwd);
}
