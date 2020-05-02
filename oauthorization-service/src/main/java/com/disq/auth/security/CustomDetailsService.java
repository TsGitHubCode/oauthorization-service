package com.disq.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.disq.auth.dao.OAuthDAO;
import com.disq.auth.model.CustomUser;
import com.disq.auth.model.UserEntity;

@Service
public class CustomDetailsService implements UserDetailsService {
   @Autowired
   OAuthDAO oauthDao;

	@Override
	public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
		 UserEntity userEntity = null;
	      try {
	         userEntity = oauthDao.getUserDetails(username);
	         CustomUser customUser = new CustomUser(userEntity);
	         return customUser;
	      } catch (Exception e) {
	         e.printStackTrace();
	         throw new UsernameNotFoundException("User " + username + " was not found in the database");
	      }
	   }

 
} 