package Loops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int binary_num = 0;
        int pw = 1;
        while(decimal_num>0) {
            int unit_digit = decimal_num % 2;
            binary_num += (unit_digit * pw);
            pw *= 10;
            decimal_num /= 2;
        }
        System.out.println("The binary number is "+binary_num);
    }
}
