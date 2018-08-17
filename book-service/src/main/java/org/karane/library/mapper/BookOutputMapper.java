package org.karane.library.mapper;

import org.karane.library.entity.Book;
import org.karane.library.output.BookOutput;

public class BookOutputMapper {

    public static BookOutput map(Book book){
        BookOutput bookOutput = new BookOutput();

        bookOutput.setBookId(book.getBookId());
        bookOutput.setTitle(book.getTitle());
        bookOutput.setAuthors(book.getAuthors());
        bookOutput.setIsbn(book.getIsbn());
        bookOutput.setOriginalPublicationYear(book.getOriginalPublicationYear());
        bookOutput.setImageUrl(book.getImageUrl());
        bookOutput.setSmallImageUrl(book.getSmallImageUrl());


        return bookOutput;
    }
}
