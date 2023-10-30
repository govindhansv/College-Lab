import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Convert to binary
        String binary = decimalToBase(num, 2);
        System.out.println("Binary representation: " + binary);
        
        // Convert to octal
        String octal = decimalToBase(num, 8);
        System.out.println("Octal representation: " + octal);
        
        // Convert to hexadecimal
        String hex = decimalToBase(num, 16);
        System.out.println("Hexadecimal representation: " + hex);
    }
    
    // Function to convert decimal to the given base
    private static String decimalToBase(int num, int base) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int remainder = num % base;
            if (remainder < 10) {
                result.insert(0, remainder); // Append digit as-is for bases 2-9
            } else {
                char hexChar = (char) ('A' + remainder - 10); // Convert to hex character for base 16
                result.insert(0, hexChar);
            }
            num /= base;
        }
        return result.toString();
    }
}
