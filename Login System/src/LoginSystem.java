import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vun = ""; // Valid Username
        String vp = "";  // Valid Password

        while (true) {
            // Konsolu temizle
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("[1] - Sign up");
            System.out.println("[2] - Log in");
            System.out.println("[0] - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Please enter a new Username: ");
                    vun = scanner.nextLine();
                    System.out.print("Please enter a new Password: ");
                    vp = scanner.nextLine();
                    System.out.println("Registration successful!");
                    break;
                case 2:
                    System.out.print("Please enter your username for logging in: ");
                    String un = scanner.nextLine();
                    System.out.print("Please enter your password for logging in: ");
                    String pas = scanner.nextLine();

                    if (un.equals(vun) && pas.equals(vp)) {
                        System.out.println("You have successfully logged in.");
                    } else {
                        System.out.println("Invalid Username or Password entered.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
