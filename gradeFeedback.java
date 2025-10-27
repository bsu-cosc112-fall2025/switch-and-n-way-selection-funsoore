import java.util.Scanner;

public class gradeFeedback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numeric grade: ");
        int grade = scanner.nextInt();
        if (grade >= 90) {
            String assign = "A";
            System.out.println("Excellent work! You received an " + assign + ".");
        } else if (grade >= 80 && grade < 90) {
            String assign = "B";
            System.out.println("Good job! You received a " + assign + ".");
        } else if (grade >= 70 && grade < 80) {
            String assign = "C";
            System.out.println("You passed with a " + assign + ". Keep trying!");
        } else if (grade >= 60 && grade < 70) {
            String assign = "D";
            System.out.println("You received a " + assign + ". Consider seeking extra help.");
        } else {
            String assign = "F";
            System.out.println("Unfortunately, you received an " + assign + ". Don't give up, keep working hard!");
        }
        scanner.close();
    }
}
