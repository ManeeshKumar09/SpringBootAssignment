package com.capgemini.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Books {
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String category;
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}
	public String getCategory() 
	{
		return category;
	}

	public Books(int id,String name,String category)
	{
		super();
		this.id=id;
		this.name=name;
		this.category=category;
	}
	
	public Books()
	{
		super();
	}
	
	@Override
	public String toString()
	{
		return "id:"+id+"\n"+"name:"+name+"\n"+"city:"+category;
	}
	


}
