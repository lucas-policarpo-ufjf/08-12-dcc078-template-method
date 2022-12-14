import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserClientTest {

    @Test
    void shouldVerifyAuthCorrectlyWithValidToken() {
        ClientUser user = new ClientUser();
        user.setName("Caio");
        user.setToken("User4567515");

        assertEquals(true, user.verifyAuth());
    }

    @Test
    void shouldNotVerifyAuthWithInvalidToken() {
        ClientUser user = new ClientUser();
        user.setName("Carla");
        user.setToken("U56456s564e65r");

        assertEquals(false, user.verifyAuth());
    }

    @Test
    void shouldDoLoginWithValidToken() {
        ClientUser user = new ClientUser();
        user.setName("Caio");
        user.setToken("User4567515");

        assertEquals("User Caio autenticado com sucesso!", user.doLogin());
    }

    @Test
    void shouldNotDoLoginWithInvalidToken() {
        ClientUser user = new ClientUser();
        user.setName("Carla");
        user.setToken("U56456s564e65r");

        assertEquals("Credenciais inválidas!", user.doLogin());
    }
}