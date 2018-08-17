package org.karane.library.mapper;

import org.karane.library.entity.User;
import org.karane.library.input.UserInput;

public class UserInputMapper {

    public static User map(UserInput userInput){
        User user = new User();

        user.setCpf(userInput.getCpf());
        user.setName(userInput.getName());

        return user;
    }
}
