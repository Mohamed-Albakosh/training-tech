package com.onlineStore.ui;

import java.util.Scanner;

import com.onlineStore.dto.User;
import com.onlineStore.expression.InvalidPassword;
import com.onlineStore.expression.UserNameTaken;
import com.onlineStore.expression.UserNotFound;
import com.onlineStore.services.AuthService;
import com.onlineStore.services.AuthServiceImpl;

public class RegistrationMenu implements Menu{
	
	private Menu welcomeMenu;

	private Menu nextMenu;
	
	private Scanner scan;
	
	private AuthService authService;

	public RegistrationMenu() {
		super();
		//this.scan = new Scanner(System.in);
	}

	

	public Menu getWelcomeMenu() {
		return welcomeMenu;
	}



	public void setWelcomeMenu(Menu welcomeMenu) {
		this.welcomeMenu = welcomeMenu;
	}



	public Menu getNextMenu() {
		return nextMenu;
	}



	public void setNextMenu(Menu nextMenu) {
		this.nextMenu = nextMenu;
	}



	
	public AuthService getAuthService() {
		return authService;
	}



	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}



	public RegistrationMenu(AuthService authService, Menu welcomeMenu) {
		super();
		this.authService = authService;
		this.welcomeMenu = welcomeMenu;
	}

	@Override
	public void displayOptions()  {
		User user = new User();
		System.out.println("Please enter a  username:");
		user.setUserName(scan.nextLine());
		System.out.println("Please enter a  password:");
		user.setPassWord(scan.nextLine());
		System.out.println("Please ente an EmailId:");
		user.setEmailId(scan.nextLine());
		System.out.println("Please enter a new password:");
		user.setSuperCoins(100);
		
		try {
			if (!authService.existingUser(user)) {
				try {
					authService.registerUser(user);
					nextMenu = null;
				} catch (UserNameTaken e) {
					System.out.println("Username taken, please try again");
					nextMenu = welcomeMenu;
				}
			} else {
				System.out.println("Username taken, please try again");
				nextMenu = welcomeMenu;
			}
		} catch (UserNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu advance() {
		
		return nextMenu;
	}



	@Override
	public Scanner getScanner() {
		return this.scan;
	}



	@Override
	public void setScanner(Scanner scan) {
		this.scan = scan;
		
	}

}
