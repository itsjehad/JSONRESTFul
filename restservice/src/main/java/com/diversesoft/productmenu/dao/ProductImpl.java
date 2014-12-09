package com.diversesoft.productmenu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.diversesoft.productmenu.Product;

public class ProductImpl implements IProductDAO {
	
	
	public List<Product> GetProducts(int productId) {
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Product where parent_id = ?");
	  query.setInteger(0, productId);
	  @SuppressWarnings("unchecked")
	  List<Product> productList = query.list();  
	  session.close();  
	  return productList;  
	}
	public List<Product> GetProductsTemp(int productId)
	{
		List<Product> retProducts = new ArrayList<Product>();
		retProducts.add(new Product(1, "P0", productId));
		retProducts.add(new Product(2, "P1", productId));
		retProducts.add(new Product(3, "P2", productId));
		return retProducts;		
	}

}
