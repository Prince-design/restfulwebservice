package com.zensar.restful;
/**
 * @author Prince Tiwari
 * @creation_date 04th Oct 2019 2:08pm
 * @Modification_date 04th Oct 2019 2:08pm
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class it represents database table PRODUCT1
 *              it is POJO class. IT is a web service class
 */

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

@Path("/products")
public class ProductWebService {
	private ProductService productService;

	public ProductWebService() {
		// TODO Auto-generated constructor stub
		productService = new ProductServiceImpl();
	}
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
}
