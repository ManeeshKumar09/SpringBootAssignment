package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entity.Product;

public interface ProductServiceI 
{
	public Product save(Product product);

	public List<Product> reterive();

	public Boolean delete(int id);
}
