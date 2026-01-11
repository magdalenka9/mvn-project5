package org.example;

import net.datafaker.Faker;

public class CalculatorTest {

    static Faker faker = new Faker();

    // 1️⃣ multiply ერთ რიცხვზე (მაგალითად საწყისი რიცხვი * 2)
    public int multiply(int a) {
        return a * 2;  // უბრალოდ მაგალითი, ორჯერ გამრავლება
    }

    // 2️⃣ multiply ორი რიცხვისთვის
    public int multiply(int a, int b) {
        return a * b;
    }

    // 3️⃣ multiply სამი რიცხვისთვის
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // print method to show results
    public void printResults() {
        // generate random numbers with Faker
        int num1 = faker.number().numberBetween(1, 10);
        int num2 = faker.number().numberBetween(1, 10);
        int num3 = faker.number().numberBetween(1, 10);

        System.out.println("Multiply one number (" + num1 + "): " + multiply(num1));
        System.out.println("Multiply two numbers (" + num1 + " * " + num2 + "): " + multiply(num1, num2));
        System.out.println("Multiply three numbers (" + num1 + " * " + num2 + " * " + num3 + "): " + multiply(num1, num2, num3));
    }


    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        calc.printResults();
    }
}
