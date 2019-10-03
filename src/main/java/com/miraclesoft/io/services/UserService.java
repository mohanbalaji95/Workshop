package com.miraclesoft.io.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miraclesoft.io.model.Users;
import com.miraclesoft.io.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public Users getUserById(long id) {
		return userRepo.findById(id).get();
	}
}
