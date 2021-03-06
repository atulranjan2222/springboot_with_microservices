package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.filter.JwtRequestFilter;
import com.example.demo.model.JwtAutherizationRequest;
import com.example.demo.model.JwtAutherizationResponse;
import com.example.demo.serviceIml.JwtUserDetailsService;
import com.example.demo.util.JWTUtils;

@RestController
@RequestMapping("/demo")
@RefreshScope
public class JwtAuthenticationController {

	Logger logger = LoggerFactory.getLogger(DemoController.class);
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTUtils jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	//@Value("${spring.message}")
	//String message;
	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtAutherizationRequest authenticationRequest)
			throws Exception {
		
		//logger.info("****************** "+message);

		authenticate(authenticationRequest.getUserName(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new JwtAutherizationResponse(token));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

}
