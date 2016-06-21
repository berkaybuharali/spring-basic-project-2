package org.pim.service;

import org.pim.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    int addNewBook(String title, String author, int price);

    Book getBook(String title);
}
