package org.pim.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Books {
    List<Book> books;

    public Books() {}

    public Books (List<Book> books){
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
