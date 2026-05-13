package com.denisskuzmins.projekt;

public class Magazine extends LibraryItem {

    private int issueNumber;
    private String category;
    private int publicationYear;

    public Magazine(int id, String title, int issueNumber, String category, int publicationYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Magazine: " + title;
    }
}