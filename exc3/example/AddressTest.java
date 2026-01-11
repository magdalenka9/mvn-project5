package org.example;

import net.datafaker.Faker;

public class AddressTest {

    private String city;
    private String street;
    private String zipcode;

    public AddressTest() {
    Faker faker = new Faker();
    city= faker.address().city();
    street = faker.address().streetAddress();
    zipcode = faker.address().zipCode();
    }
    public String toString() {
        return street + ", " + city + ", ZIP: " + zipcode;
    }

}