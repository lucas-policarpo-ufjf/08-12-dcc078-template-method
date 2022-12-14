import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAdminTest {

    @Test
    void shouldVerifyAuthCorrectlyWithValidToken() {
        UserAdmin user = new UserAdmin();
        user.setName("João");
        user.setToken("Admin4567515");

        assertEquals(true, user.verifyAuth());
    }

    @Test
    void shouldNotVerifyAuthWithInvalidToken() {
        UserAdmin user = new UserAdmin();
        user.setName("Julia");
        user.setToken("a456dmasin4567515");

        assertEquals(false, user.verifyAuth());
    }

    @Test
    void shouldDoLoginWithValidToken() {
        UserAdmin user = new UserAdmin();
        user.setName("João");
        user.setToken("Admin4567515");

        assertEquals("Admin João autenticado com sucesso!", user.doLogin());
    }

    @Test
    void shouldNotDoLoginWithInvalidToken() {
        UserAdmin user = new UserAdmin();
        user.setName("Julia");
        user.setToken("a456dmasin4567515");

        assertEquals("Credenciais inválidas!", user.doLogin());
    }
}