package BTU;

class Utils {
    static void main() {
        C c = new C();
        c.setData();
        System.out.println(String.format("The sum of the digits of the integer %d is: %d", c.c, c.getDigitSum()));
        c.printProduct();
        c.printSum();

        A a = new A();
        a.setData();
        a.plusTwelve();
        System.out.println(a.isEvenOrOdd());

        B b = new B();
        b.setData();
        System.out.println(String.format("%d + %d = %d", A.x, b.y, b.getSum()));

        RandomRange randomRange = new RandomRange();
        randomRange.main();
    }
}