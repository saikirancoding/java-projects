package com.symbiosis.jpaSetCollection;

import java.util.*;

import javax.persistence.*;

@Entity
public class Orders {

	@Id
	int order_id;
	
	@ElementCollection
	Set<Item> items=new HashSet<Item>();

	
	public Orders() {
		super();
	}

	
	public Orders(int order_id, Set<Item> items) {
		super();
		this.order_id = order_id;
		this.items = items;
	}


	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	
}
