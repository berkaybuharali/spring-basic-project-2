package org.pim.model;

public class Book {

    private String title;
    private String author;
    private int price;
    private int version;
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
}
