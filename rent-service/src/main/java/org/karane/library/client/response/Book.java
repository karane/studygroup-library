package org.karane.library.client.response;

import org.springframework.data.annotation.Id;

public class Book {

    @Id
    public String id;

    private String bookId;
    private String title;
    private String isbn;
    private String originalPublicationYear;
    private String imageUrl;
    private String smallImageUrl;
    private String authors;
    private Integer stock;

    public Book() {}

    public Book(String bookId, String title, String isbn, String originalPublicationYear, String imageUrl, String smallImageUrl, String authors, Integer stock) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.originalPublicationYear = originalPublicationYear;
        this.imageUrl = imageUrl;
        this.smallImageUrl = smallImageUrl;
        this.authors = authors;
        this.stock = stock;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getOriginalPublicationYear() {
        return originalPublicationYear;
    }

    public void setOriginalPublicationYear(String originalPublicationYear) {
        this.originalPublicationYear = originalPublicationYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}

