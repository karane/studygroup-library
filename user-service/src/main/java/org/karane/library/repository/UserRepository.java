package org.karane.library.repository;

import org.karane.library.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends MongoRepository<User, String> {
    User findByCpf(String cpf);
}
