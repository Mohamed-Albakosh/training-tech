package com.onlineStore.ui;

import java.util.Scanner;

import com.onlineStore.dto.User;
import com.onlineStore.expression.InvalidPassword;
import com.onlineStore.expression.UserNotFound;
import com.onlineStore.services.AuthService;

public class LoginMenu implements Menu{
	private AuthService authService;
    private Scanner scan;
    
    
	public LoginMenu(AuthService authService) {
		super();
		this.authService = authService;
		//scan = new Scanner(System.in);
	}
	
	

	public AuthService getAuthService() {
		return authService;
	}



	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}


	@Override
	public void displayOptions() {
		System.out.println("Please Enter Username");
		String userName = scan.nextLine();
		System.out.println("Please Enter Password");
		String passWord=scan.nextLine();
		
		
		try {
			authService.authenticateUser(userName, passWord );
			System.out.println("Login successful");
			System.out.println(" Are you the Admen yes or no");
			String answer=scan.nextLine();
			if(answer == "YES" || answer == "yes"  || answer == "Yes") {
				
				
			}else {
				
			}
			
			
			//throw new Error();
		} catch (UserNotFound e) {
			System.out.println("Username does not exist.  Please register an account.");
		} catch (InvalidPassword e) {
			System.out.println("Authentication error, check username/password");
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong. Please try again later.");
			e.printStackTrace();
		} finally {
			System.out.println("Login Process Ended");
		}
		
		
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return null;
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
