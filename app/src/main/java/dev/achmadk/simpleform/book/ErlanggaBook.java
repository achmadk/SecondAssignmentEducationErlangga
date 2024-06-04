package dev.achmadk.simpleform.book;

import java.util.Date;

public class ErlanggaBook implements IBook {
    private final String id;

    private final String title;

    private final String author;
    private final Date publishedDate;

    public ErlanggaBook(String id, String title, String author, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }
}
