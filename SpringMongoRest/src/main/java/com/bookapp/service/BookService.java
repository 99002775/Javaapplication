package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	
	Book addBook(Book book);
	boolean deleteBook(Integer bookid)throws BookNotFoundException;
	Book getBookById(Integer bookid)throws BookNotFoundException;
	Book UpdateBook(Book book);
	


    List<Book> getAllBooks();
    List<Book> getBookbyAuthor(String author) throws BookNotFoundException;;
    List<Book> getBookbycategory(String category)throws BookNotFoundException;;
	
}
