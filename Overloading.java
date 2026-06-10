class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Overloading extends Calculator {
    public static void main(String[] args) {
        Overloading c = new Overloading();

        c.add(1, 3);      // Output: 4
        c.add(1, 3, 3);   // Output: 7
    }
}