package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            n *= (-1);
            System.out.println("The absolut value is: "+n);
        } else {
            System.out.println("The number is: "+n);
        }
    }
}
