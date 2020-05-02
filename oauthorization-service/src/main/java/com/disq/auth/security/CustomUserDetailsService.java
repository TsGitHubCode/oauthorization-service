package com.disq.auth.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

import com.disq.auth.dao.OAuthDAO;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	OAuthDAO oauthDao;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		return null;
	
		
	}
}
