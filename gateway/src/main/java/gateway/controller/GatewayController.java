package gateway.controller;

import gateway.EncryptClient;
import gateway.fallback.EncryptOperation;
import gateway.model.MyMessage;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/${api.version:v1}")
public class GatewayController implements EncryptOperation {

    private final EncryptClient encryptClient;

    public GatewayController(EncryptClient encryptClient) {
        this.encryptClient = encryptClient;
    }

    @Get("/encrypt/{text}")
    public MyMessage encrypt(String text){
        return encryptClient.encrypt(text);
    }
}
