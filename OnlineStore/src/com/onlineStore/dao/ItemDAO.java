package com.onlineStore.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.onlineStore.dto.Item;


public class ItemDAO {
	
	private List<Item> itemList;
	private Scanner sc;
	//private sum;
	
	public ItemDAO() {
		itemList=new ArrayList<Item>();
		sc = new Scanner(System.in);
	}
	
	public void insertItem( Item i)
	{
		itemList.add(i);
	}
	public void display()
	{
		itemList.stream().forEach(eobj->{
			System.out.println("Product id is "+eobj.getItemname());
			System.out.println("Product name is "+eobj.getCategory());
			System.out.println("Price is "+eobj.getBuyingPrice());
			
		});
	}
	public void updateItem(int i) {
		
		
		
	}
	public void deleteItem(int i) {
		
		itemList.remove(i);
		
	}
	
	
	public Item findItembyNam(String iName) {
		Item item = itemList.stream().filter(empobj->empobj.getItemname().equals(iName)).findFirst().get();
		return item;
	}
	
	public double getBuyingTotal() {
		  
		return itemList.stream().mapToDouble(Item::getBuyingPrice).sum();
			  
	}


}
