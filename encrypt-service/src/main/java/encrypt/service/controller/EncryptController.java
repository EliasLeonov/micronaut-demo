package encrypt.service.controller;

import encrypt.service.model.MyMessage;
import encrypt.service.services.EncryptService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class EncryptController{
    private final EncryptService encryptService;

    public EncryptController(EncryptService encryptService) {
        this.encryptService = encryptService;
    }

    @Get("/encrypt/{text}")
    public MyMessage encrypt(String text){
        return encryptService.encrypt(text);
    }
}
