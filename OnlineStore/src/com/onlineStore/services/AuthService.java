package com.onlineStore.services;

import com.onlineStore.dto.User;
import com.onlineStore.expression.InvalidPassword;
import com.onlineStore.expression.UserNameTaken;
import com.onlineStore.expression.UserNotFound;

public interface AuthService {
	
    public boolean existingUser(User user) throws UserNotFound;
	
	public User authenticateUser(String userName, String  passWord) throws InvalidPassword, UserNotFound;
	
	public void registerUser(User user) throws UserNameTaken;
	
	

}
