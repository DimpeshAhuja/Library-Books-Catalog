package com.example.library.Model;

public class Book {

  private Integer id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;


    public Book() {
    }


    public Book(Integer id, String title, String author, String isbn, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }


    public Integer getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getIsbn() {
        return isbn;
    }


    public boolean isAvailable() {
        return available;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    
}

