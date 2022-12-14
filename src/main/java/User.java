public abstract class User {
  String name;
  String token;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getType() {
    return "User";
  }

  public abstract Boolean verifyAuth();

  public String doLogin() {
    Boolean validAuth = this.verifyAuth();
    if (validAuth) {
      return this.getType() + " " + this.name + " autenticado com sucesso!";
    } else {
      return "Credenciais inválidas!";

    }
  }
}
