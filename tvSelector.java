import java.util.Scanner;

public class tvSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a TV model:");
        int model = scanner.nextInt();
        
        switch (model) {
            case 1:
               System.out.println("Model 100: Remote control, timer, stereo sound — $1000");
               break;
            case 2:
               System.out.println("Model 200: Adds picture-in-picture — $1200");
               break;
            case 3:
                System.out.println("Model 300: Adds HDTV, flat screen, 16x9 aspect ratio — $2400");
                break;
            default:
               System.out.println("Invalid model number.");
               break;
        }
        scanner.close();
    }
}