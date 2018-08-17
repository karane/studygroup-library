package org.karane.library.client;


import org.karane.library.client.response.User;
import org.karane.library.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private RestTemplate restTemplate;

    @Value("${url.userservice}")
    private String userServieUrl;

    public User getUserByCpf(String cpf){
        try{
            return restTemplate.getForObject(userServieUrl + cpf, User.class);
        }catch (HttpClientErrorException e){
            if(e.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR){
                throw new NotFoundException("User not found");
            }
            throw e;
        }
    }
}
