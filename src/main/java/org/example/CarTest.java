package org.example;

import net.datafaker.Faker;


public class CarTest {
    String brand;
    String model;
    int year;

    Faker faker = new Faker();

    public void testPrintInfo() {
        brand = faker.vehicle().manufacturer();
        model = faker.vehicle().model();
        year = faker.number().numberBetween(1990, 2025);

        System.out.println("მოდელი="+ model + "მწარმოებელი=" + brand + "წელი=" + year);

    }

    public static void main(String[] args) {
        CarTest car = new CarTest();
        car.testPrintInfo();
    }


}