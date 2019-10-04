package com.zensar.services;
/**
 * @author Prince Tiwari
 * @creation_date 04th Oct 2019 11:44am
 * @Modification_date 04th Oct 2019 11:44am
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class it represents database table PRODUCT1
 *              it is POJO class. it is used in buisness layer 
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
	List<Product> findAllProducts();

	Product findProductById(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);

	List<Product> FindProductByPriceRange(double priceMin, double priceMax);

	List<Product> FindProductByName(String productName);

	List<Product> FindProductByBrand(String productBrand);

	long getProductCount();
}