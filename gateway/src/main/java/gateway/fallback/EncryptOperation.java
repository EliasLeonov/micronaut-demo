package gateway.fallback;

import gateway.model.MyMessage;
import io.micronaut.http.annotation.Get;

public interface EncryptOperation {
    @Get("/encrypt/{text}")
    MyMessage encrypt(String text);
}
