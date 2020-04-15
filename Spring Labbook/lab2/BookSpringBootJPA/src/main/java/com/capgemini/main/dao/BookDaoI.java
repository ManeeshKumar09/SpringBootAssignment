package com.capgemini.main.dao;

import java.util.List;

import com.capgemini.main.entity.Books;

public interface BookDaoI 
{
	public String create(Books t);
	public List<Books> reterive();
	public Books findById(int id);
	public void delete(int id);
	public void update(Books t);
	public boolean findID(int id);
}
