package org.example;

import net.datafaker.Faker;

public class UserTest1 {
    private String name;
    private String mail;
    private AddressTest address;

    public UserTest1() {
        Faker faker = new Faker();
        name = faker.name().fullName();
        mail = faker.internet().emailAddress();
        address = new AddressTest();
    }

    public void printInfo() {
        System.out.println("სახელი = " + name + "იმეილი = " + mail + "მისამართი = " + address);


    }
    public static void main(String[] args) {
        UserTest1 user = new UserTest1();
        user.printInfo();
    }


    }










