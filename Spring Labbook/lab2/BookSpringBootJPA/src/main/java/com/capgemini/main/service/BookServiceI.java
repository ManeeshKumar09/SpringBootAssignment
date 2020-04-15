package com.capgemini.main.service;

import java.util.List;
import com.capgemini.main.entity.Books;

public interface BookServiceI 
{
	public Books findById(int id);
	public Books save(Books t);
	public List<Books> findAll();
	public boolean existsById(int id);
	public void deleteById(int id);
	public void updateData(Books t);
}
