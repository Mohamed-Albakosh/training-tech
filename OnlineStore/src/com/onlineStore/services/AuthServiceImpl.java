package com.onlineStore.services;

import com.onlineStore.dao.UserDAO;
import com.onlineStore.dto.User;
import com.onlineStore.expression.InvalidPassword;
import com.onlineStore.expression.UserNameTaken;
import com.onlineStore.expression.UserNotFound;

public class AuthServiceImpl implements AuthService{
	
private UserDAO userDAO;
    
    
    
	public AuthServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	@Override
	public boolean existingUser(User user) throws   UserNotFound{
		
		if (userDAO.findUserbyNam(user.getUserName()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public User authenticateUser(String userName, String  passWord) throws  InvalidPassword, UserNotFound {
		User existingUser = userDAO.findUserbyNam(userName);

		if (existingUser !=  null && existingUser.getPassWord().equals(passWord)) {
			return existingUser;
		}

		throw new InvalidPassword();
	}

	@Override
	public void registerUser(User user) throws UserNameTaken {
		userDAO.insertUser(user);
		
	}
	
	
		
	

}
