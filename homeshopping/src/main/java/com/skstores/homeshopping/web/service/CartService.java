package com.skstores.homeshopping.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.skstores.homeshopping.web.dao.CartDao;
import com.skstores.homeshopping.web.model.Cart;
import com.skstores.homeshopping.web.model.Product;

public class CartService {

	@Autowired
	private CartDao cartDao;
	
	public void additemtoCart(Cart cart, Product product) {
		
		cartDao.addItemToCart(cart, product);
	}
	public void removeItem(Cart cart, Product product) {
		cartDao.removeItem(cart, product);	
	}
		
	
	public double calculateTotalPrice(Cart cart) {
		
		double price =0;
		for(Product product :cart.getProductList())
		{
		
			price+=product.getPrice();
			
		}
		
		return price;
		
	}

}
