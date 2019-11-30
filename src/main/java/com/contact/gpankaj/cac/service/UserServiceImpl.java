package com.contact.gpankaj.cac.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.contact.gpankaj.cac.model.User;
import com.contact.gpankaj.cac.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		//user.set
		userRepository.save(user);
	}

	@Override
	public boolean isUserAlreadyPresent(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
