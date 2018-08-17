package org.karane.library.mapper;

import org.karane.library.entity.Book;
import org.karane.library.input.BookInput;
import org.karane.library.output.BookOutput;

public class BookInputMapper {

    public static Book map(BookInput bookInput){
        Book book = new Book();

        book.setBookId(bookInput.getBookId());
        book.setAuthors(bookInput.getAuthors());
        book.setTitle(bookInput.getTitle());
        book.setImageUrl(bookInput.getImageUrl());
        book.setSmallImageUrl(bookInput.getSmallImageUrl());
        book.setOriginalPublicationYear(bookInput.getOriginalPublicationYear());
        book.setIsbn(bookInput.getIsbn());

        return book;
    }
}
