package com.onlineStore.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onlineStore.dao.ItemDAO;
import com.onlineStore.dao.ProductDAO;
import com.onlineStore.dto.Item;
import com.onlineStore.dto.Product;
import com.onlineStore.dto.User;

public class StoreInformation {
	
	private List<User> usersList;
    private Map<String, Product> productsMap;
    private List<Item> itemsList;
    private ProductDAO product;
    
    private ItemDAO item,
    
    public StoreInformation() {
        // Initialize lists and map
    	usersList = new ArrayList<>();
        productsMap = new HashMap<>();
        itemsList = new ArrayList<>();
    }
    
    
    
   
    
    public void listProductsByCategory(String category) {
        // List products by category
    }
    
   
    
    public double calculateTotalSpent() {
    	
    	return  item.getBuyingTotal();
        
    }
    
    public double displayProfitByCategory() {
    	
    	return  (product.getSellingTotal() - item.getBuyingTotal());
    }
    
 
    
    
    public void viewProducts() {
        product.display();
    }
    
    public void applyFilters(String filterType) {
        // Apply filters based on category or price
    }

}
