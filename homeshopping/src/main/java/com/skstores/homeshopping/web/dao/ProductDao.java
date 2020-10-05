package com.skstores.homeshopping.web.dao;

import java.util.List;

import com.skstores.homeshopping.web.model.Product;

public interface ProductDao {

	List <Product> getAllProducts();
	void addProdcut(Product product);
	void removeproduct(long productId);
	void updateProduct(Product product);
	Product getProductById(long productId);
	 
}
