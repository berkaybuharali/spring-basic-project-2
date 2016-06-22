package org.pim.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private String title;
    private String author;
    private int price;
    private int version;
    public Book() {}
    public Book(String title, String author, int price, int version) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.version = version;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public int getVersion() {
        return version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

