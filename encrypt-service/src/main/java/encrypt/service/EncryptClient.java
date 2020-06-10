package encrypt.service;

import encrypt.service.model.MyMessage;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/")
public interface EncryptClient{

    @Get("/encrypt/{text}")
    MyMessage encrypt(String text);

}
