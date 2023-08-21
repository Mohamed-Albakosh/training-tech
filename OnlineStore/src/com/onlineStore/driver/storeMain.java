package com.onlineStore.driver;

import java.util.Scanner;

import com.onlineStore.dao.UserDAO;
import com.onlineStore.dao.UserDAOImpl;
import com.onlineStore.services.AuthServiceImpl;
import com.onlineStore.ui.LoginMenu;
import com.onlineStore.ui.Menu;
import com.onlineStore.ui.RegistrationMenu;
import com.onlineStore.ui.WelcomeMenu;


public class storeMain {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		UserDAO userDAO= new UserDAOImpl();
		
		AuthServiceImpl  authService= new AuthServiceImpl(userDAO);
		
		Menu register = new RegistrationMenu();
				
		Menu login =new LoginMenu(authService);
		
		Menu welcomeMenu = new WelcomeMenu(login, register);
		
        ((RegistrationMenu)register).setWelcomeMenu(welcomeMenu);
		
		((RegistrationMenu)register).setAuthService(authService);
		
		login.setScanner(scan);
		
		register.setScanner(scan);
		
		welcomeMenu.setScanner(scan);
		
		
		Menu nextMenu = welcomeMenu;
		
		do {
			nextMenu.displayOptions();
			nextMenu = welcomeMenu.advance();
			
		} while (nextMenu != null);

	}

}
