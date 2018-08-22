package com.accolite.pru.health.AuthApp.service;

import com.accolite.pru.health.AuthApp.model.User;
import com.accolite.pru.health.AuthApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Optional<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public Optional<User> findByEmail(String username) {
		return userRepository.findByEmail(username);
	}
}