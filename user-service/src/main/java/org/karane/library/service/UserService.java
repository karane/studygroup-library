package org.karane.library.service;

import org.karane.library.entity.User;
import org.karane.library.exception.UserDoesNotExistException;
import org.karane.library.input.UserInput;
import org.karane.library.mapper.UserInputMapper;
import org.karane.library.mapper.UserOutputMapper;
import org.karane.library.output.UserOutput;
import org.karane.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserOutput getUserInformation(String cpf){

        User user = userRepository.findByCpf(cpf);

        if(user == null){
            throw new UserDoesNotExistException("No user with this cpf: " + cpf + " was found.");
        }


        UserOutput userOutput = UserOutputMapper.map(user);

        return userOutput;
    }

    public UserOutput insertUser(UserInput userInput) {

        User user = UserInputMapper.map(userInput);

        User insertedUser = userRepository.insert(user);

        UserOutput userOutput = UserOutputMapper.map(insertedUser);

        return userOutput;
    }
}
