package org.karane.library.repository;

import org.karane.library.entity.Rent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RentRepository extends MongoRepository<Rent, String> {
    List<Rent> findAllByCpf(String cpf);
}

