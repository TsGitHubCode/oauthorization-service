package com.disq.auth.dao;

import java.util.Optional;

import com.disq.auth.model.UserEntity;
import com.disq.auth.repository.Auth0Repository;

public class OAuthDAO {
	
	private Auth0Repository auth0Repository;
	
	public OAuthDAO(Auth0Repository auth0Repository) {
        this.auth0Repository = auth0Repository;
    }
	
	public Optional<UserEntity> getUserDetails(String username) {
	      Optional<UserEntity> userEntity = auth0Repository.findByusername(username);
	      if(userEntity.isPresent()) {
	    	  return userEntity;
	      }
	      //TODO Grants
	      else
	    	  return null;
	   }
}
