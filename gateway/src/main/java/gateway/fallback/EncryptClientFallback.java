package gateway.fallback;

import gateway.model.MyMessage;
import io.micronaut.retry.annotation.Fallback;

@Fallback
public class EncryptClientFallback implements EncryptOperation{
    @Override
    public MyMessage encrypt(String text) {
        return new MyMessage("Fallback!");
    }
}
