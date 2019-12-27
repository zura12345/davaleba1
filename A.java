package BTU;

import java.util.Scanner;

class A {

    static int x;

    A() {
        System.out.println("Hello");
    }

    void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
    }

    void plusTwelve() {
        System.out.println(String.format("%d + %d = %d", x, 12, x + 12));
    }

    String isEvenOrOdd() {
        if ((x & 1) == 0) {
            return String.format("%d is an even number.", x);
        } else {
            return String.format("%d is an odd number.", x);
        }
    }
}
