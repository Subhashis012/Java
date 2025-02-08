package Loops;

import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int original = n;

        while(n>0) {
            n = n/10;
            count++;
            //System.out.println(n);
        }
        System.out.println("The number of digits in " + original + " is "+count);
    }
}
