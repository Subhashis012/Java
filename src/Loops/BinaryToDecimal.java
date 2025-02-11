package Loops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int ans = 0;
        int pw = 1;
        while(binary_num>0) {
            int unit_digit = binary_num%10;
            ans += (unit_digit * pw); // 1 + 8 = 9
            pw *= 2;
            binary_num /= 10;
        }
        System.out.println("The decimal number is "+ans);
    }
}
