package com.skstores.homeshopping.web.dao;

import com.skstores.homeshopping.web.model.Cart;
import com.skstores.homeshopping.web.model.Product;

public class CartDaoImpl implements CartDao{

	@Override
	public void addItemToCart(Cart cart, Product product) {
		cart.getProductList().add(product);
	}

	@Override
	public void removeItem(Cart cart, Product product) {
		cart.getProductList().remove(product);
		
	}
	}


