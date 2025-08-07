import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = getNumber("Enter first number: ");
        int num2 = getNumber("Enter second number: ");
        int result = add(num1, num2);
        displayResult(result);
    }

    // Method to get a number from the user
    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }

    // Method to display the result
    public static void displayResult(int sum) {
        System.out.println("The sum is: " + sum);
    }
}
