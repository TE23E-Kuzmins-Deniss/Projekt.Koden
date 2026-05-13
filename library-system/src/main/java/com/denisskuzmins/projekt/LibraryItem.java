package com.denisskuzmins.projekt;

public class LibraryItem {
    protected int id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(int id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }
}