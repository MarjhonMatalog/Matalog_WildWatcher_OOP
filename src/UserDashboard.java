import java.util.Scanner;

class UserDashboard extends Dashboard {
    private UserAccount user;

    public UserDashboard(UserAccount user) {
        this.user = user;
    }
    // DISPLAY THE MENU OPTIONS
    @Override
    public void displayMenu() {
        System.out.println("\nUser Dashboard");
        System.out.println("1. Add Animal Sighting");
        System.out.println("2. View Sightings");
        System.out.println("3. Delete Sighting");
        System.out.println("4. Logout");
    }
    // HANDLES THE INPUT
    @Override
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSighting(scanner);
                    break;
                case 2:
                    viewSightings();
                    break;
                case 3:
                    deleteSighting(scanner);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    // ADDING AN ANIMAL SIGHTING
    private void addSighting(Scanner scanner) {
        System.out.print("Enter animal name: ");
        String animalName = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        WildWatcher.sightings.add(new AnimalSighting(WildWatcher.sightingIdCounter++, animalName, location, date, description));
        System.out.println("Sighting added successfully.");
    }
    // DISPLAY THE SIGHTING
    private void viewSightings() {
        if (WildWatcher.sightings.isEmpty()) {
            System.out.println("No sightings found.");
        } else {
            System.out.println("Animal Sightings:");
            for (AnimalSighting sighting : WildWatcher.sightings) {
                System.out.println(sighting.getDetails());
            }
        }
    }
    // DELETE A SIGHTING BY ID
    private void deleteSighting(Scanner scanner) {
        System.out.print("Enter the ID of the sighting to delete: ");
        int id = scanner.nextInt();

        AnimalSighting sightingToDelete = WildWatcher.sightings.stream()
                .filter(sighting -> sighting.getId() == id)
                .findFirst()
                .orElse(null);

        if (sightingToDelete != null) {
            WildWatcher.sightings.remove(sightingToDelete);
            System.out.println("Sighting no. " + id + " has been deleted.");
        } else {
            System.out.println("Sighting no. " + id + " not found.");
        }
    }
}
