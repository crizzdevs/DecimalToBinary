import java.util.Scanner;

public class (FILENAME) {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a decimal number (or type STOP to quit): ");
                String input = sc.nextLine();
                
                if (input.equalsIgnoreCase("STOP")) {
                    System.out.println("Program terminated.");
                    break;
                }
                
                try {
                    int decimal = Integer.parseInt(input);
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println(decimal + " -> " + binary);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please enter a valid integer or STOP.");
                }
            }
        }
    }
}
