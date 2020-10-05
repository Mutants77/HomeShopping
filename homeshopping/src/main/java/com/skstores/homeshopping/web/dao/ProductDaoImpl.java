package com.skstores.homeshopping.web.dao;

import java.util.List;

import com.skstores.homeshopping.web.model.Product;

public class ProductDaoImpl implements ProductDao{

	private List <Product> productList; 
	
	@Override
	public List<Product> getAllProducts() {
		return productList;
	}

	@Override
	public void addProdcut(Product product) {
		productList.add(product);
		
	}

	@Override
	public void removeproduct(long productId) {
		for(Product product:productList) {
			if(productId==product.getId())
			{
				productList.remove(product);
			}
		}
		
		
		
	}

	@Override
	public void updateProduct(Product product) {
		productList.add(product);
		productList.remove(product);
		
	}

	public List <Product> getProductList() {
		return productList;
	}

	public void setProductList(List <Product> productList) {
		this.productList = productList;
	}

	@Override
	public Product getProductById(long productId) {
		for(Product prodcut : productList) {
			if(productId==prodcut.getId())
			{
				return prodcut;
			}
		}
		return null;
	}

}
