public class UserAdmin extends User {

  public Boolean verifyAuth() {
    String token = this.getToken();
    String type = this.getType();
    return token.startsWith(type, 0);
  }

  @Override
  public String getType() {
    return "Admin";
  }
}
