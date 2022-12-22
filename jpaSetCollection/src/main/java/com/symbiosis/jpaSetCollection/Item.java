package com.symbiosis.jpaSetCollection;

import javax.persistence.*;

@Embeddable
public class Item {

	int item_code;
	String item_name;
	int item_price;
	
	
	
	public Item() {
		super();
	}
	
	
	public Item(int item_code, String item_name, int item_price) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.item_price = item_price;
	}


	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	
	
}
