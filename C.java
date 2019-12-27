package BTU;

import java.util.Scanner;

class C {

    private int a, b;
    int c;

    void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();
    }

    private int getLastDigit() {
        a = Math.abs(a);

        return a % 10;
    }

    private int getFirstDigit() {
        b = Math.abs(b);

        while (b >= 10) {
            b /= 10;
        }

        return b;
    }

    int getDigitSum() {
        int digitSum = 0;

        c = Math.abs(c);

        while (c > 0) {
            digitSum += c % 10;
            c /= 10;
        }

        return digitSum;
    }

    void printProduct() {
        System.out.println(String.format("%d * %d = %d", getLastDigit(), getFirstDigit(), getLastDigit() * getFirstDigit()));
    }

    void printSum() {
        System.out.println(String.format("%d + %d = %d", getFirstDigit(), getLastDigit() * getFirstDigit(), getFirstDigit() + getLastDigit() * getFirstDigit()));
    }
}