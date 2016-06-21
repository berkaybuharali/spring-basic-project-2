package org.pim.service;

import org.pim.dao.BookDao;
import org.pim.model.Book;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Inject
    private BookDao dao;

    public List<Book> getBooks() {
        List<Book> books = null;
        books = dao.getBooks();
        return books;
    }


    public int addNewBook(String title, String author, int price) {
        int inserted = 0;
        inserted = dao.insertBook(title, author, price);
        return inserted;
    }


    public Book getBook(String title) {
        return dao.getBook(title);
    }
}
