import java.util.Scanner;
import arithmeticoperation.ArithmeticOperation;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        double result = 0;
        switch (choice) {
            case 1:
                result = ArithmeticOperation.add(a, b);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = ArithmeticOperation.subtract(a, b);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = ArithmeticOperation.multiply(a, b);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = ArithmeticOperation.divide(a, b);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
        }

    }
}
