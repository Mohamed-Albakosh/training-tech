package com.onlineStore.dto;

public class Item {
	private String	Itemname;
	private String	Category;
	private double	buyingPrice;
	public Item(String itemname, String category, double buyingPrice) {
		super();
		Itemname = itemname;
		Category = category;
		this.buyingPrice = buyingPrice;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	
	


}
