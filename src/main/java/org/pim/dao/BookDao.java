package org.pim.dao;

import org.pim.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {
    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(createBook("Hey", "Me", 10));
        bookList.add(createBook("Bye", "You", 20));
        return bookList;
    }

    public int insertBook(String title, String author, int price) {
        createBook(title, author, price);
        return 1;
    }

    public Book getBook(String title) {
        return createBook(title, "Berkay", 50);
    }

    private Book createBook(String title, String author, int price) {
        return new Book(title, author, price, 1);
    }
}
