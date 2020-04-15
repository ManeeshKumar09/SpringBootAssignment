package com.capgemini.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.main.entity.Books;

@Transactional
@Repository
public class BookDaoImp implements BookDaoI 
{	
	@PersistenceContext
	EntityManager em;

	@Override
	public String create(Books b) 
	{
		// TODO Auto-generated method stub
		em.persist(b);//this object will make a reference in database table
		              //(add the data of book in database using the object )
		return "data inserted";
	}

	@Override
	public List<Books> reterive() 
	{
		// TODO Auto-generated method stub
		String Qstr="SELECT traniee FROM Traniee traniee";
		TypedQuery<Books> query=em.createQuery(Qstr,Books.class);
		return query.getResultList();	
	}

	@Override
	public Books findById(int id) 
	{
		// TODO Auto-generated method stub
		return em.find(Books.class, id);
	}

	public boolean findID(int id)
	{
		if(em.contains(em.find(Books.class, id)))
		{
			return true;
		}
		return false;
	}

	@Override
	public void delete(int id) 
	{
		// TODO Auto-generated method stub	
		Books t=em.find(Books.class, id);//this method will which id to remove
		System.out.println(t.getId() +" "+t.getName()+ " "+t.getCategory()+" is removed");
		em.remove(t);//this is object from the database
	}

	@Override
	public void update(Books b) 
	{
		// TODO Auto-generated method stub
		  Books tranieeUpdate= em.find(Books.class, b.getId());		
	      tranieeUpdate.setCategory(b.getCategory());
	      tranieeUpdate.setName(b.getName());
	      System.out.println("update ");
	}
}
