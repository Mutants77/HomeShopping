package com.skstores.homeshopping.web.model;

import java.util.List;

public class Customer {
	private long id;
	private String name;
	private List<Order> orderList;
	private Cart cart;
	private String address;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orderList;
	}

	public void setOrders(List<Order> orders) {
		this.orderList = orders;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
