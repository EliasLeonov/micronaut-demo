package encrypt.service.services;

import encrypt.service.model.MyMessage;
import io.micronaut.runtime.server.EmbeddedServer;

import javax.inject.Singleton;

@Singleton
public class EncryptService {
    private final EmbeddedServer embeddedServer;

    public EncryptService(EmbeddedServer embeddedServer) {
        this.embeddedServer = embeddedServer;
    }

    public MyMessage encrypt(String text){
        String encryptedText = new StringBuilder(text).reverse().toString();
        return new MyMessage(encryptedText + "-->" + embeddedServer.getPort());
    }
}
