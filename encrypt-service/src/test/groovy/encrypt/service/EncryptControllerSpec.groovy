package encrypt.service

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class EncryptControllerSpec extends Specification {

    @Inject
    EncryptClient encryptClient

    void 'test encrypt controller'(){
        expect:
            encryptClient.encrypt("Hola").getText() == "aloH"
    }

    void 'test encrypt controller 2'(){
        expect:
        encryptClient.encrypt("Hola").getText() == "aloH"
    }
}
