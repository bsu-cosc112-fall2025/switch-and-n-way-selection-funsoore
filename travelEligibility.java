import java.util.Scanner;


public class travelEligibility {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a valid passport? (true/false): ");
        boolean hasPassport = scanner.nextBoolean();

        if (age >= 18) {
            if (hasPassport) {
                System.out.println("You are eligible to travel.");
            } else {
                System.out.println("You need a valid passport to travel.");
            }
        } else if (age < 18 && hasPassport) {
            System.out.println("You need parental consent to travel.");
        } else {
            System.out.println("You are not eligible to travel.");
        }
    
        scanner.close();
    }
    
}