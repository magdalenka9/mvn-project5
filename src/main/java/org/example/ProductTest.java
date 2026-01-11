package org.example;

import net.datafaker.Faker;

public class ProductTest {

     public double price;
     public double discount;


    public ProductTest() {
        Faker faker = new Faker();
        price = faker.number().randomDouble(2, 50, 500);     // ფასი 50–500
        discount = faker.number().randomDouble(2, 5, 50);   // ფასდაკლება 5–50
    }


    public double getPriceAfterDiscount() {
        return price - discount;
    }


    public static void main(String[] args) {
        ProductTest product = new ProductTest();

        System.out.println("საწყისი ფასი: " + product.price);
        System.out.println("ფასდაკლება: " + product.discount);
        System.out.println("ფასი ფასდაკლების შემდეგ: " + product.getPriceAfterDiscount());
    }
}
