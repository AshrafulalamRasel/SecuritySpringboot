package com.example.security.Securityapp.service;

import com.example.security.Securityapp.repsoitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findOneByUsername(username);
	}
}