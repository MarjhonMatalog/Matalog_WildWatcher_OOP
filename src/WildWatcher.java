import java.util.ArrayList;
import java.util.Scanner;

public class WildWatcher {
    public static ArrayList<AnimalSighting> sightings = new ArrayList<>();
    public static int sightingIdCounter = 1;

    private static ArrayList<UserAccount> users = new ArrayList<>();

    public static void main(String[] args) {
        //  admin user
        users.add(new AdminUser("Marjan", "Marjan123"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("Sayonara!");
                    return;
                default:
                    System.out.println("Try again.");
            }
        }
    }
    // REGISTRATION
    private static void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (isUserExists(username)) {
            System.out.println("Username already exists.");
        } else {
            users.add(new UserAccount(username, password) {
                @Override
                public void showDashboard() {
                    new UserDashboard(this).handleUserInput();
                }
            });
            System.out.println("Account created successfully!");
        }
    }
    // CHECK IF USER ALREADY EXIST
    private static boolean isUserExists(String username) {
        return users.stream().anyMatch(user -> user.getUsername().equals(username));
    }
    // LOGIN TO THE SYSTEM
    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        UserAccount user = users.stream()
                .filter(u -> u.getUsername().equals(username) && u.verifyPassword(password))
                .findFirst()
                .orElse(null);

        if (user != null) {
            user.showDashboard();
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
