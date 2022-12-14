import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserClientTest {

    @Test
    void shouldVerifyAuthCorrectlyWithValidToken() {
        UserClient user = new UserClient();
        user.setName("Caio");
        user.setToken("User4567515");

        assertEquals(true, user.verifyAuth());
    }

    @Test
    void shouldNotVerifyAuthWithInvalidToken() {
        UserClient user = new UserClient();
        user.setName("Carla");
        user.setToken("U56456s564e65r");

        assertEquals(false, user.verifyAuth());
    }

    @Test
    void shouldDoLoginWithValidToken() {
        UserClient user = new UserClient();
        user.setName("Caio");
        user.setToken("User4567515");

        assertEquals("User Caio autenticado com sucesso!", user.doLogin());
    }

    @Test
    void shouldNotDoLoginWithInvalidToken() {
        UserClient user = new UserClient();
        user.setName("Carla");
        user.setToken("U56456s564e65r");

        assertEquals("Credenciais inválidas!", user.doLogin());
    }
}