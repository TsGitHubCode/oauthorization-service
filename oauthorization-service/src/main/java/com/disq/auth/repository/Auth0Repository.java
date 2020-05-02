package com.disq.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disq.auth.model.UserEntity;


public interface Auth0Repository extends JpaRepository<UserEntity, Long> {
	Optional<UserEntity> findByusername(String username);
	Optional<UserEntity> findBypassword(String password);
}
