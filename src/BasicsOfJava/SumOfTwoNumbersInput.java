package BasicsOfJava;
import java.util.Scanner;
public class SumOfTwoNumbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter first number: ");
        x = sc.nextInt();
        System.out.print("Enter second number: ");
        y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of the two numbers is: "+sum);
    }
}
