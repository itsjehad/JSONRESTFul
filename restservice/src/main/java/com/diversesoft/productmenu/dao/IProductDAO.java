package com.diversesoft.productmenu.dao;

import java.util.List;

import com.diversesoft.productmenu.Product;

public interface IProductDAO {
	public List<Product> GetProducts(int productId);
	public List<Product> GetProductsTemp(int productId);
	
}
