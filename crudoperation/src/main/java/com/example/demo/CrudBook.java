package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class CrudBook {
	@Id
	private int id;
	private String name;
	private String description;
	private String type;
    private String author;
	
	public CrudBook(int id,String name, String description, String type, String author) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.author = author;
	}

	public CrudBook() {
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	


}
