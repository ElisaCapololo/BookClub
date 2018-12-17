package com.elisacapololo.clubdelivros;

public class Book {

    private String title;
    private  String category;
    private String description;
    private int cover;
    private String bookUpload;
    private String bookDownload;

    public Book() {}

    public Book(String title, String category, String description, int cover, String bookUpload, String bookDownload) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.cover = cover;
        this.bookUpload = bookUpload;
        this.bookDownload = bookDownload;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getBookUpload() {
        return bookUpload;
    }

    public void setBookUpload(String bookUpload) {
        this.bookUpload = bookUpload;
    }

    public String getBookDownload() {
        return bookDownload;
    }

    public void setBookDownload(String bookDownload) {
        this.bookDownload = bookDownload;
    }
}
