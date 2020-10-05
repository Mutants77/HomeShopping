package com.skstores.homeshopping.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.skstores.homeshopping.web.dao.ProductDao;
import com.skstores.homeshopping.web.model.Product;

public class ProductService {
		
	@Autowired
	ProductDao productDao;

	public void addProduct(Product product) {
		productDao.addProdcut(product);
	}

	public void deleteProduct(long productId) {
		productDao.removeproduct(productId);
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
	}

	public List<Product> viewAllProducts() {
		return productDao.getAllProducts();

		}
}
