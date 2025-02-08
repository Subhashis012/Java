package Loops;

import java.util.Scanner;

public class RaisedPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int ans = 1;
        for(int i=1;i<=b;i++) {
            ans *= a;
        }
        System.out.println("Base is "+a+" and power is "+b+" and the result is "+ans);
    }
}
