package BTU;

import java.util.Scanner;

class B extends A {

    int y;

    void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of y: ");
        y = scanner.nextInt();
    }

    int getSum() {
        return x + y;
    }
}