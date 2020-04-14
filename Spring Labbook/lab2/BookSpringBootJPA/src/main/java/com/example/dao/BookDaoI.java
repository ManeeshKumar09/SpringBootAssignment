package com.example.dao;

import java.util.List;
import com.example.entity.Books;

public interface BookDaoI 
{
	public void create(Books b);

	public List<Books> reterive();

	public Books findById(int id);

	public void delete(int id);

	public void update(int id);

}
