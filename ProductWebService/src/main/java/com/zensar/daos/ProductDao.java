package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Prince Tiwari
 * @creation_date 04th Oct 2019 10:12am
 * @Modification_date 04th Oct 2019 10:12am
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class it represents database table PRODUCT1
 *              it is POJO class. IT is a product Dao interface used in
 *              persistence layer.
 */
public interface ProductDao {
	List<Product> getAll();

	Product getById(int productId);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
}
