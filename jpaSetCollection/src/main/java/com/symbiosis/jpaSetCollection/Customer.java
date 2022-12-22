package com.symbiosis.jpaSetCollection;


import javax.persistence.*;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;

	@OneToOne
	Orders order;

	public Customer() {
		super();
	}

	public Customer(int cid, String cname, Orders order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.order = order;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	

}
