package com.arch_i_tech.dto;

import java.sql.Date;

public class BookDTO {
	private String BookName;
	private String BookAuthor;
	private String Publisher;
	private long Price;
	private long NumberOfPages;
	private String Genre;
	private String Description;
	private Date PublicationYear;
	private String Language;

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		Price = price;
	}

	public long getNumberOfPages() {
		return NumberOfPages;
	}

	public void setNumberOfPages(long numberOfPages) {
		NumberOfPages = numberOfPages;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getPublicationYear() {
		return PublicationYear;
	}

	public void setPublicationYear(Date publicationYear) {
		PublicationYear = publicationYear;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public BookDTO(String bookName, String bookAuthor, String publisher, long price, long numberOfPages, String genre,
			String description, Date publicationYear, String language) {
		super();
		BookName = bookName;
		BookAuthor = bookAuthor;
		Publisher = publisher;
		Price = price;
		NumberOfPages = numberOfPages;
		Genre = genre;
		Description = description;
		PublicationYear = publicationYear;
		Language = language;
	}

	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
