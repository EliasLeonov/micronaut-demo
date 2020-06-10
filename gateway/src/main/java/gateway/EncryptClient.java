package gateway;

import gateway.fallback.EncryptOperation;
import io.micronaut.http.client.annotation.Client;

@Client(id = "encrypt-service")
public interface EncryptClient extends EncryptOperation {

}
