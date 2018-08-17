package org.karane.library.service;

import org.karane.library.client.BookClient;
import org.karane.library.client.UserClient;
import org.karane.library.client.response.Book;
import org.karane.library.entity.Rent;
import org.karane.library.exception.BookStockEmptyException;
import org.karane.library.exception.NotFoundException;
import org.karane.library.mapper.RentOutputMapper;
import org.karane.library.output.RentOutput;
import org.karane.library.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private BookClient bookClient;

    @Autowired
    private UserClient userClient;

    public RentService(RentRepository rentRepository, BookClient bookClient, UserClient userClient) {
        this.rentRepository = rentRepository;
        this.bookClient = bookClient;
        this.userClient = userClient;
    }

    public String rentABook(String cpf, String bookId) {

        Book book = bookClient.getBookByBookId(bookId);

        userClient.getUserByCpf(cpf);

        if(book.getStock() <= 0){
            throw new BookStockEmptyException("Book stock is empty.");
        }

        Rent rent = rentRepository.save(new Rent(cpf, bookId));

        book.setStock(book.getStock() - 1);
        bookClient.updateBook(book);

        return rent.getReceipt();
    }

    public Integer returnBook(String receipt){

        return rentRepository.findById(receipt)
                .map(rent -> {
                    rentRepository.deleteById(receipt);
                    Book book = bookClient.getBookByBookId(rent.getBookId());
                    book.setStock(book.getStock() + 1);
                    bookClient.updateBook(book);
                    return book.getStock();
                }).orElseThrow(() -> new NotFoundException("Rent not found."));
    }

    public List<RentOutput> getRentsByCpf(String cpf){
        return rentRepository.findAllByCpf(cpf)
                .stream()
                .map(RentOutputMapper::map)
                .collect(Collectors.toList());
    }
}
