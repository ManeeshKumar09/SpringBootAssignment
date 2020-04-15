package com.capgemini.main.repo;

import java.util.List;

import com.capgemini.main.entity.Product;

public interface ProductRepoI 
{
	public void create(Product Pproduct);
	public List<Product> reterive();
	public Boolean delete(int id);
}
