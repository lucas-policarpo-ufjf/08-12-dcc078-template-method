public class ClientUser extends User {

  public Boolean verifyAuth() {
    String token = this.getToken();
    String type = this.getType();
    return token.startsWith(type, 0);
  }

}
