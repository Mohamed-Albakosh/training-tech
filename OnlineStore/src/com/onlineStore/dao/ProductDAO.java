package com.onlineStore.dao;


import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

import com.onlineStore.dto.Item;
import com.onlineStore.dto.Product;

public class ProductDAO {
	private Map<String,Product> productMap;
	private Scanner sc;
	public ProductDAO() {
		productMap=new HashMap<String,Product>();
		sc = new Scanner(System.in);
	}
	
	public void insertProduct(String str, Product p)
	{
		productMap.put(str,p);
	}
	public void display()
	{
		productMap.values().stream().forEach(eobj->{
			System.out.println("Product id is "+eobj.getProductid());
			System.out.println("Product name is "+eobj.getProductName());
			System.out.println("Price is "+eobj.getSellingPrice());
		});
	}
	public void updateProduct(int p) {
		
		
		
	}
	public void deleteProduct(int p) {
		
		productMap.remove(p);
	
		
	}
	
	public Product findProductbyId(int pid) {
		Product product =productMap.values().stream().filter(empobj->empobj.getProductid()==pid).findFirst().get();
		return product;
	}
	
	public Product findProductbyNam(String pName) {
		Product product =productMap.values().stream().filter(empobj->empobj.getProductName().equals(pName)).findFirst().get();
		return product;
	}
	
	public double getSellingTotal() {
		  
		return productMap.values().stream().mapToDouble(Product::getSellingPrice).sum();
			  
	}
}

