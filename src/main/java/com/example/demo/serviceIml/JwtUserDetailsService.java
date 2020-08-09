package com.example.demo.serviceIml;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService  implements UserDetailsService{
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("atul".equals(username)) {
		return	new User("atul", "atul@123", new ArrayList<>());
		}else{
			throw new UsernameNotFoundException("usernot found with username "+username);
		}
		
	} 

}
