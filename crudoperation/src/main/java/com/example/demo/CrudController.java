package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@RestController
public class CrudController {
	
	@Autowired
	private CrudService crudservice;
	@RequestMapping("/books")
	public List<CrudBook> getbooks(){
		return crudservice.getbook();
		
	}
	@RequestMapping(value="/books", method = RequestMethod.POST)
	public CrudBook createBook (@RequestBody CrudBook book) {
		return crudservice.createBook(book);
		
	}
	@RequestMapping("/books/{id}")
	public Optional<CrudBook> getbookbyid(@PathVariable("id") Integer bookid) {
		return crudservice.getbookbyid(bookid);
		
	}
	@RequestMapping(value="/books", method = RequestMethod.PUT)
	public CrudBook updateBook (@RequestBody CrudBook incomebook) {
		return crudservice.updateBook(incomebook);
		
	}
	@DeleteMapping(value="/books/{bookid}")
	public String deletebyidBook (@PathVariable Integer bookid) {
		return crudservice.deletebyid(bookid);
		
	}
	

	

}
