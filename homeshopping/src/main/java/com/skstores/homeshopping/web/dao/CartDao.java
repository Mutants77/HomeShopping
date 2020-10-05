package com.skstores.homeshopping.web.dao;

import com.skstores.homeshopping.web.model.Cart;
import com.skstores.homeshopping.web.model.Product;

public interface CartDao {
	
	void addItemToCart(Cart cart , Product product);
	void removeItem(Cart cart , Product product);
}
