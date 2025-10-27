import java.util.Scanner;
public class FlooringSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a flooring type:");

        int choice = scanner.nextInt();
        

        switch (choice) {
            case 1:
               System.out.println("Scored concrete — $3000");
                break;
            case 2:
                System.out.println(" Carpeting — $5000");
                break;
            case 3:
                System.out.println(" Wood floors in living areas, carpeting in bedrooms, tile in bath areas — $10,000");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid flooring type.");
                return;
        }

        scanner.close();
    }
}