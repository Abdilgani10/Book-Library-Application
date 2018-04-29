package com.qa.booksApplication.booksLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;


import com.qa.controller.BookController;
import com.qa.model.Books;
import com.qa.repository.BookRepository;

public class BookControllerTest {
	
	@InjectMocks
	private BookController bc;
	
	@Mock
	private BookRepository bookrepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	
	}
	
	
	@Test
	public void testBookGet(){
		
		Books bk = new Books();
		bk.setId(1L);
		when(bookrepository.findOne(1L)).thenReturn(bk);
		
		Books abook = bk.get(1L);
		assertEquals(1L, abook.getId().longValue());
	}
}
