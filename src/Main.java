import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====Library System=====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                studentLogin(scanner);
            } else if (choice == 2) {
                adminLogin(scanner);
            } else if (choice == 3) {
                System.out.println("Terima Kasih!");
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public static void studentLogin(Scanner scanner) {
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();

        System.out.println(nim.length() == 15 ? "Successful Login as Student" : "User Not Found");
    }

    public static void adminLogin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        System.out.println(username.equals("admin") && password.equals("admin") ? "Successful Login as Admin" : "Admin User Not Found!!");
    }
}