package Task1;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", basket=" + basket +
                '}';
    }

    private   String login;
    private   String pass;
    private   Basket basket;
}
