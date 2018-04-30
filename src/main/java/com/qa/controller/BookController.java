package com.qa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.model.Books;

@RestController
@RequestMapping("ppi/v1/")
public class BookController {

	@RequestMapping(value = "books", method = RequestMethod.GET)
	public List<Books> list(){
		return BookStub.list();
		
	}
	@RequestMapping(value = "books", method = RequestMethod.POST)
	public Books create (@RequestBody Books books){
		return BookStub.create(books);
	}
	
	@RequestMapping(value = "books/{id}", method = RequestMethod.GET)
	public Books get (@PathVariable long id){
		return BookStub.get(id);
	}
	
	@RequestMapping(value = "books/{id}", method = RequestMethod.PUT)
	public Books edit (@PathVariable long id, @RequestBody Books books ){
		return BookStub.edit(id, books);
	
	}
	
	@RequestMapping(value = "books/{id}", method = RequestMethod.DELETE)
	public Books delete (@PathVariable long id){
		return BookStub.delete(id);
		
	}
	
	
}
