package Methods;

import java.util.Scanner;


class Algebra {
    int a,b;
    Algebra(int x, int y) {
        System.out.println("Constructor called");
        a = x;
        b = y;
    }
    int add() {
        return a + b;
    }
    int sub() {
        return a - b;
    }
    int mul() {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5,7);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(10, 20);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
}
