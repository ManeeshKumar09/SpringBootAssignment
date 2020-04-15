package com.capgemini.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.entity.Product;
import com.capgemini.main.repo.ProductRepoI;

@Transactional
@Service
public class ProductService implements ProductServiceI
{
	@Autowired
	private ProductRepoI productRepo;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		productRepo.create(product);
		return product;
	}

	@Override
	public List<Product> reterive() {
		// TODO Auto-generated method stub
		return productRepo.reterive();
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		
		return productRepo.delete(id);
	}
}
