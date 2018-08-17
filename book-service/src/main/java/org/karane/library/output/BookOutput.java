package org.karane.library.output;

public class BookOutput {


    private String id;

    private String bookId;
    private String title;
    private String isbn;
    private String originalPublicationYear;
    private String  imageUrl;
    private String smallImageUrl;
    private String authors;

    public BookOutput() {}

    public BookOutput(String bookId, String title, String isbn, String originalPublicationYear, String imageUrl, String smallImageUrl, String authors) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.originalPublicationYear = originalPublicationYear;
        this.imageUrl = imageUrl;
        this.smallImageUrl = smallImageUrl;
        this.authors = authors;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", originalPublicationYear='" + originalPublicationYear + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", smallImageUrl='" + smallImageUrl + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}

