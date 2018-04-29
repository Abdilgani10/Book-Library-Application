package com.qa.model;

public class Books {
	
	Long id;
	String title;
	String description;
	String author;
	Integer yearPublished;

	public Books() { }

	public Books(Long id, String title, String description, String author, Integer yearDiscovered) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String condition) {
		this.author = author;
	}



	public Integer getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(Integer yearPublished) {
		this.yearPublished = yearPublished;
	}
}



