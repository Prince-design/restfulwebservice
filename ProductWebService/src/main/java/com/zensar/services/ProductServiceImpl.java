package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import com.zensar.daos.ProductDaoImpl;
import com.zensar.daos.ProductDao;
import com.zensar.entities.Product;

/**
 * @author Prince Tiwari
 * @creation_date 04th Oct 2019 11:55am
 * @Modification_date 04th Oct 2019 11:55am
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class it represents database table PRODUCT1
 *              it is POJO class. IT is a product Dao implementation class used
 *              in persistence layer.
 */

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}

	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public List<Product> FindProductByPriceRange(double priceMin, double priceMax) {
		// TODO Auto-generated method stub
		List<Product> allProducts = productDao.getAll();
		List<Product> productInPriceRange = new ArrayList<Product>();

		for (Product product : allProducts) {
			if (product.getPrice() >= priceMin && product.getPrice() <= priceMax) {
				productInPriceRange.add(product);

			}
		}
		return productInPriceRange;
	}

	@Override
	public List<Product> FindProductByName(String productName) {
		// TODO Auto-generated method stub
		List<Product> allProducts = productDao.getAll();
		List<Product> productByName = new ArrayList<Product>();
		for (Product product : allProducts) {
			if (product.getName().contains(productName)) {
				productByName.add(product);
			}
		}
		return productByName;
	}

	@Override
	public List<Product> FindProductByBrand(String productBrand) {
		// TODO Auto-generated method stub
		List<Product> allProducts = productDao.getAll();
		List<Product> productByBrand = new ArrayList<Product>();
		for (Product product : allProducts) {
			if (product.getBrand().contains(productBrand)) {
				productByBrand.add(product);
			}
		}
		return productByBrand;
	}

	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		List<Product> allProducts = productDao.getAll();
		int count = 0;
		for (Product product : allProducts) {
			count++;
		}
		return count;
	}

}
