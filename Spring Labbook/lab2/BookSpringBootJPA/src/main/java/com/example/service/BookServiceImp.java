package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.BookDaoImp;
import com.example.entity.Books;

@Service
public  class BookServiceImp implements BookServiceI
{
	@Autowired
	BookDaoImp bookdao;

	@Override
	public Books findById(int id) {
		// TODO Auto-generated method stub
		return bookdao.findById(id);
	}

	/*@Override
	public Books save(Books b) {
		Books b1=null;
		if(bookdao.create(b).equals("data inserted"))
		{
			return b;
		}
		return b1;
	}*/

	@Override
	public List<Books> findAll() {
		// TODO Auto-generated method stub
		return bookdao.reterive();
	}

	@Override
	public Books existsById(int id) {
		
		return bookdao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		bookdao.delete(id);
		
	}

	@Override
	public void updateData(int b) 
	{
		bookdao.update(b);
		
	}
	@Override
	public Books save(Books t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(Books t) {
		// TODO Auto-generated method stub
		
	}
	

}
