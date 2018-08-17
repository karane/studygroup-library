package org.karane.library.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.karane.library.entity.Book;
import org.karane.library.exception.BookDoesNotExistException;
import org.karane.library.input.BookInput;
import org.karane.library.mapper.BookInputMapper;
import org.karane.library.mapper.BookOutputMapper;
import org.karane.library.output.BookOutput;
import org.karane.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookOutput getBookInformation(String bookId){

        Book book = bookRepository.findByBookId(bookId);

        if(book == null){
            throw new BookDoesNotExistException("No book with this id: " + bookId + " was found.");
        }


        BookOutput bookOutput = BookOutputMapper.map(book);

        return bookOutput;
    }

    public BookOutput insertBook(BookInput bookInput) {

        Book book = BookInputMapper.map(bookInput);

        Book insertedBook = bookRepository.insert(book);

        BookOutput bookOutput = BookOutputMapper.map(insertedBook);

        return bookOutput;
    }
}
