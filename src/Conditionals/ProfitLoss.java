package Conditionals;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.print("Your profit is: ");
            System.out.println(sp-cp);
        }
        else {
            System.out.print("Your loss is: ");
            System.out.println(cp-sp);
        }
    }
}
