package com.onlineStore.dao;

import com.onlineStore.dto.User;

public interface UserDAO {
	
	public void insertUser( User u);
	
	public void display();
	
	public void updateUser(int u); 
	
	public void deleteUser(int u); 
	
	public User findUserByEmailId(String eid); 
	
	public User findUserbyNam(String uName); 


}
