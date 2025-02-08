package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;
        int original = n;
        while(n>0) {
            int lastDigit = n%10;
            reverse = reverse*10 + lastDigit;
            n = n/10;
        }

        System.out.println("The reverse of " + original + " is "+reverse);
    }
}
