package entity;

import entity.Author;

public class Book {
    private int id;
    private String name;
    private int stock;
    private Author[] authors;
    private int ISBN;

    public Book(int id, String name, int stock, Author[] authors, int ISBN) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.authors = authors;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
