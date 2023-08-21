package com.onlineStore.ui;

import java.util.Scanner;

public interface Menu {
	 public void displayOptions() ;
		
	 public Menu previousMenu();
	 
	 public Menu advance();
	 
	 public Scanner getScanner();
		
	 public void setScanner(Scanner scan);

}
