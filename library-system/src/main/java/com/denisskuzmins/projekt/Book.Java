package com.denisskuzmins.projekt;

public class Book extends LibraryItem {

    private String author;
    private String genre;
    private int pages;

    public Book(int id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book: " + title + " | " + author;
    }
}