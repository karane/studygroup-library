package org.karane.library.mapper;

import org.karane.library.entity.User;
import org.karane.library.output.UserOutput;

public class UserOutputMapper {

    public static UserOutput map(User user){
        UserOutput userOutput = new UserOutput();

        userOutput.setCpf(user.getCpf());
        userOutput.setName(user.getName());

        return userOutput;
    }
}
