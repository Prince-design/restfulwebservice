package com.zensar.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

/**
 * @author Prince Tiwari
 * @creation_date 04th Oct 2019 10:29am
 * @Modification_date 04th Oct 2019 10:29am
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class it represents database table PRODUCT1
 *              it is POJO class. IT is a product Dao implementation class used
 *              in persistence layer.
 */
public class ProductDaoImpl implements ProductDao {
	private Session session;

	public ProductDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c = new Configuration().configure();
		SessionFactory s = c.buildSessionFactory();
		session = s.openSession();
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Product").getResultList();
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return session.get(Product.class,productId);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.save(product);
		t.commit();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.update(product);
		t.commit();

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.delete(product);
		t.commit();
	}

}
