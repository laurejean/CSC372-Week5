import java.util.Scanner;

public class RecursiveProductCalculator {

    // Recursive method to get user input and return the product
    public static int getProduct(int count) {
        Scanner scanner = new Scanner(System.in);
        
        // Base case: if count is 0, return 1 
        if (count == 0) {
            return 1;
        }
        
        // Get the current number from the user
        System.out.print("Enter number " + ": ");
        int number = scanner.nextInt();
        
        // Recursive call to get the product of the remaining numbers
        return number * getProduct(count - 1);
    }

    public static void main(String[] args) {
        // Number of inputs to be taken
        int count = 5;
        
        // Calculate the product of the numbers
        int product = getProduct(count);
        
        // Display the result
        System.out.println("The product of the numbers is: " + product);
    }
}

