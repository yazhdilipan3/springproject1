package com.example.demo;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CrudService {
	@Autowired
	private crudrepository bookrepo;
	
	public List<CrudBook> getbook(){
		List<CrudBook> booklist = new ArrayList<>();
		bookrepo.findAll().forEach(CrudBook ->booklist.add(CrudBook));
		return booklist;
		
	}
	public CrudBook createBook(CrudBook book) {
		return bookrepo.save(book);
	}
	public Optional<CrudBook> getbookbyid( Integer bookid) {
		return bookrepo.findById(bookid);
		
	}
	public CrudBook updateBook(CrudBook incomebook) {
		return bookrepo.save(incomebook);
	}
	public String deletebyid(Integer bookid) {
		 bookrepo.deleteById(bookid);
		 return "delete successfull";
	}
	
	
}
