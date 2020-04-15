package com.capgemini.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.main.dao.BookDaoI;
import com.capgemini.main.entity.Books;

@Service
public class BookServiceImp implements BookServiceI {
	
	@Autowired
	BookDaoI bookDao;

	@Override
	public Books findById(int id) 
	{
		// TODO Auto-generated method stub
		return bookDao.findById(id);
	}

	@Override
	public Books save(Books b) 
	{
		Books t1=null;
		if(bookDao.create(b).equals("data inserted"))
		{
			return b;
		}
		return t1;
	}

	@Override
	public List<Books> findAll() 
	{
		// TODO Auto-generated method stub
		return bookDao.reterive();
	}

	@Override
	public boolean existsById(int id) 
	{
		return bookDao.findID(id);
	}

	@Override
	public void deleteById(int id) 
	{
		bookDao.delete(id);
	}

	@Override
	public void updateData(Books b) 
	{
		bookDao.update(b);
	}
}
