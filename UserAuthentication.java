import java.util.Scanner;

class AuthenticationException extends Exception {
public AuthenticationException(String message) {
super(message);
}
}

public class UserAuthentication {

private static final String VALID_USERNAME = "admin";
private static final String VALID_PASSWORD = "password123";

public static void authenticate(String username, String password) throws AuthenticationException {
if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
    throw new AuthenticationException("Authentication failed: Invalid username or password.");
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter username: ");
String username = sc.nextLine();

System.out.print("Enter password: ");
String password = sc.nextLine();

try {
    authenticate(username, password);
    System.out.println("Authentication successful!");
} catch (AuthenticationException e) {
    System.out.println(e.getMessage());
}

sc.close();
}
}
