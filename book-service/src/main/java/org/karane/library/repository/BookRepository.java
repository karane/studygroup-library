package org.karane.library.repository;

import org.karane.library.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface BookRepository extends MongoRepository<Book, String> {
    Book findByBookId(String bookId);
}
