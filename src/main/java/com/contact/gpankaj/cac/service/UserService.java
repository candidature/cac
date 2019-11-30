package com.contact.gpankaj.cac.service;

import java.util.List;

import com.contact.gpankaj.cac.model.User;

public interface UserService {
	public void saveUser(User user);
	public boolean isUserAlreadyPresent(User user);
}
