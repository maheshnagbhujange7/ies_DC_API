package com.spider._DC_API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spider._DC_API.entities.KidsEntity;

public interface KidRepo extends JpaRepository<KidsEntity, Integer> {

}
