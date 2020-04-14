package com.example.service;

import java.util.List;
import com.example.entity.Books;

public interface BookServiceI 
{
	public Books findById(int id);
	public Books save(Books t);
	public List<Books> findAll();
	public Books existsById(int id);
	public void deleteById(int id);
	public void updateData(Books t);
	void updateData(int b);
}
