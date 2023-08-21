package com.onlineStore.dto;

public class Product {
	 private int productid;
	  private String productName;
	  private double sellingPrice;
	  private int availableQuantity;

	  public Product(int productid, String productName, double sellingPrice, int availableQuantity) {
	    this.productid = productid;
	    this.productName = productName;
	    this.sellingPrice = sellingPrice;
	    this.availableQuantity = availableQuantity;
	  }

	  public int getProductid() {
	    return productid;
	  }

	  public void setProductid(int productid) {
	    this.productid = productid;
	  }

	  public String getProductName() {
	    return productName;
	  }

	  public void setProductName(String productName) {
	    this.productName = productName;
	  }

	  public double getSellingPrice() {
	    return sellingPrice;
	  }

	  public void setSellingPrice(double sellingPrice) {
	    this.sellingPrice = sellingPrice * 0.5;
	  }

	  public int getAvailableQuantity() {
	    return availableQuantity;
	  }

	  public void setAvailableQuantity(int availableQuantity) {
	    this.availableQuantity = availableQuantity;
	  }

}
