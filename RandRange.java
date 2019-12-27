package BTU;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomRange {

    private int a;
    private int b;

    private void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();
    }

    private int[] getRandomIntegers(int length, int minimum, int maximum) {
        int[] randomIntegers = new int[length];
        Random random = new Random();

        for (int index = 0; index < randomIntegers.length; index++) {
            int randomInteger = random.nextInt(maximum - minimum + 1) + minimum;
            randomIntegers[index] = randomInteger;
        }

        return randomIntegers;
    }

    private int getParityCount(int[] array, int parity) {
        int parityCount = 0;

        for (int element : array) {
            if ((element & 1) == parity) {
                parityCount++;
            }
        }

        return parityCount;
    }

    private int getEvenIntegerCount(int[] array) {
        return getParityCount(array, 0);
    }

    private int getOddIntegerCount(int[] array) {
        return getParityCount(array, 1);
    }

    private void printParityCount(String parity, int parityCount) {
        System.out.println(String.format("There are a total amount of %d %s numbers in the range.", parityCount, parity));
    }

    private int getParitySum(int[] array, int parity) {
        int paritySum = 0;

        for (int element : array) {
            if ((element & 1) == parity) {
                paritySum += element;
            }
        }

        return paritySum;
    }

    private int getEvenIntegerSum(int[] array) {
        return getParitySum(array, 0);
    }

    private int getOddIntegerSum(int[] array) {
        return getParitySum(array, 1);
    }

    private void printParitySum(String parity, int paritySum) {
        System.out.println(String.format("The sum of the %s numbers in the range is: %d", parity, paritySum));
    }