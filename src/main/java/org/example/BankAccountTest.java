package org.example;

import net.datafaker.Faker;

public class BankAccountTest {

    private int balance;

    public BankAccountTest() {
        Faker faker=new Faker();
        balance = faker.number().numberBetween(0,500);
    }

public void checkBalanceLimit (){
        if (balance<100){
            System.out.println("ბალანსი დაბალია" + balance);
        }else {
            System.out.println("ბალანსი ნორმალურია" + balance);
        }

}

    public void setBalance(int balance) {
        BankAccountTest account = new BankAccountTest();
        account.checkBalanceLimit();
    }
}


