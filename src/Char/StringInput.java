package Char;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter the name: ");
        // name = sc.next(); // ei method ta use korle space r porer word read kore na
        name = sc.nextLine();
        System.out.println("The name is: "+name);

    }
}
