import java.io.Console;
import java.util.Scanner;

public class Login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "pass123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String user = scanner.nextLine();

            System.out.print("Enter password: ");
            StringBuilder maskedPassword = new StringBuilder();
            String password = scanner.nextLine();
            for (int i = 0; i < password.length(); i++) {
                maskedPassword.append("*");
            }
            System.out.println("Password: " + maskedPassword);

            if (user.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Too many failed attempts.");
        }

        scanner.close();
    }
}
