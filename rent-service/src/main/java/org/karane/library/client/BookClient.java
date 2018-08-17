package org.karane.library.client;

import org.karane.library.client.response.Book;
import org.karane.library.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class BookClient {

    private RestTemplate restTemplate;

    @Value("${url.bookservice}")
    private String bookUrl;

    public BookClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Book getBookByBookId(String bookId){
        try{
            return restTemplate.getForObject(bookUrl + bookId, Book.class);
        } catch (HttpClientErrorException e){
            if(e.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR){
                throw new NotFoundException("Book not found in this library.");
            }

            throw e;
        }
    }

    public void updateBook(Book book){
        restTemplate.put(bookUrl + book.getBookId(), book);
    }
}
