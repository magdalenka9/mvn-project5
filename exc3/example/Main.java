package org.example;

import net.datafaker.Faker;
import org.example.*;

public class Main {

    public static void main(String[] args) {
        CarTest car = new CarTest();      //1
        car.testPrintInfo();


        Faker faker= new Faker();     //2
        UserTest user1= new UserTest(faker.name().firstName());
        user1.printInfo();

        UserTest user2=new UserTest(faker.name().firstName(), faker.internet().emailAddress());
        user2.printInfo();

        StudentTest student = new StudentTest();  // 3
        student.printInfo();


        student.setName("Giorgi");
        student.setAge(22);
        student.setGrade("Mathematics");
        student.printInfo();


        CalculatorTest calc = new CalculatorTest(); //4
        calc.printResults();



        BookTest book = new BookTest();      // 5
        System.out.println(book);


        BankAccountTest account = new BankAccountTest();     //6
        account.checkBalanceLimit();

        ProductTest product = new ProductTest();             // 7

        System.out.println("საწყისი ფასი: " + product.price);
        System.out.println("ფასდაკლება: " + product.discount);
        System.out.println("ფასი ფასდაკლების შემდეგ: " + product.getPriceAfterDiscount());


        UserTest1 user = new UserTest1();     // 8
        user.printInfo();



    }

}

