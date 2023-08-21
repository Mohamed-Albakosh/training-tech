package com.onlineStore.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.onlineStore.dto.User;

public class UserDAOImpl implements UserDAO{
	private List<User> userList;
	private Scanner sc;
	public UserDAOImpl() {
		userList=new ArrayList<User>();
		sc = new Scanner(System.in);
	}
	
	@Override
	public void insertUser( User u)
	{
		userList.add(u);
	}
	
	@Override
	public void display()
	{
		userList.stream().forEach(eobj->{
			System.out.println("Product id is "+eobj.getUserName());
			System.out.println("Product name is "+eobj.getEmailId());
			System.out.println("Price is "+eobj.getPassWord());
			System.out.println("Price is "+eobj.getSuperCoins());
		});
	}
	
	@Override
	public void updateUser(int u) {
		
		
		
	}
	
	@Override
	
	public void deleteUser(int u) {

		
		userList.remove(u);
		
	}
	
	public User findUserByEmailId(String eid) {
		User user = userList.stream().filter(empobj->empobj.getEmailId().equals(eid)).findFirst().get();
		return user;
	}
	
	@Override
	public User findUserbyNam(String uName) {
		User user = userList.stream().filter(empobj->empobj.getUserName().equals(uName)).findFirst().get();
		return user;
	}

}
