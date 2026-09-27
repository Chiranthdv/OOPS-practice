package Polymorphism;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(2, 3));        // int
        System.out.println(obj.add(2.5, 3.5));    // double
        System.out.println(obj.add(1, 2, 3));     // 3 params
    }
}

// “Compile-time polymorphism is achieved using 
// method overloading, where method name is same but parameters differ. The method call is resolved at compile time.”