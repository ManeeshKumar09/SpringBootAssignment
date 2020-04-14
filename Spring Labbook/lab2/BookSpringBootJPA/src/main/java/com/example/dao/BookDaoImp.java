package com.example.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.example.entity.Books;

@Transactional
@Repository
public class BookDaoImp implements BookDaoI
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Books s) 
	{	
         em.persist(s);//this object will make a reference in database table
	}

	@Override
	public List<Books> reterive() {
		String Qstr="SELECT book FROM Books book";
		TypedQuery<Books> query=em.createQuery(Qstr,Books.class);
		return query.getResultList();	
	}

	@Override
	public Books findById(int id) 
	{	  
		return em.find(Books.class, id);
	}

	@Override
	public void delete(int id) 
	{
		Books b = em.find(Books.class, id);//this method will which id to remove
		System.out.println(b.getId() +" "+b.getCategory() + " "+b.getName()+" is removed");
		em.remove(b);//this is object from the database	
	}

	@Override
	public void update(int id) 
	{
	  Books book = em.find(Books.class, id);		
      book.setCategory("fictional");
      System.out.println("update ");
      em.flush();      
	}
	
	//@Override
	public void updateBook(Books book) 
	{
      Books bookUpdate= em.find(Books.class, book.getId());		
      bookUpdate.setCategory(book.getCategory());
      bookUpdate.setName(book.getName());
      
      //System.out.println("update ");
      //em.flush();      
	}
	
}
