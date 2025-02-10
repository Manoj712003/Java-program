import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reversing the string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
        scanner.close();
    }
}
