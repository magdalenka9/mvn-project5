package org.example;

import net.datafaker.Faker;

public class UserTest {

    String name;
    String email;


    public UserTest(String userName) {
        name = userName;
        email = "email არ არის მითითებული";
    }

    public UserTest(String userName, String userEmail) {
        name = userName;
        email = userEmail;
    }


    public void printInfo(){
        System.out.println("სახელი=" + name + "ემაილი=" + email);
    }

    public static void main(String[] args) {
        Faker faker= new Faker();
        UserTest user1= new UserTest(faker.name().firstName());
        user1.printInfo();

        UserTest user2=new UserTest(faker.name().firstName(), faker.internet().emailAddress());
                user2.printInfo();
    }


}



