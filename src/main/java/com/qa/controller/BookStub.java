package com.qa.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.model.Books;

public class BookStub {
	private static Map<Long, Books> abook = new HashMap<Long, Books>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Books a = new Books(1L, "HarryPotter", "A young boy with a magical talent", "Abdilgani", 2001);
		abook.put(1L, a);
		Books b = new Books(2L, "The Hoobit", "The book of journey", "Tom", 2005);
		abook.put(2L, b);
		Books c = new Books(3L, "Game of thrones", "Fighting for Kingdoms", "Gani", 2014);
		abook.put(3L, c);
	}

	public static List<Books> list() {
		return new ArrayList<Books>(abook.values());
	}

	public static Books create(Books book) {
		idIndex += idIndex;
		book.setId(idIndex);
		abook.put(idIndex, book);
		return book;
	}

	public static Books get(Long id) {
		return abook.get(id);
	}

	public static Books edit(Long id, Books book) {
		abook.put(id, book);
		return book;
	}

	public static Books delete(Long id) {
		return abook.remove(id);
	}
}
