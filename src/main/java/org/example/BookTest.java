package org.example;

import net.datafaker.Faker;

public class BookTest {
    private String title;
    private String author;
    private int pages;


    public BookTest() {
        Faker faker = new Faker();
        title = faker.book().title();
        author = faker.book().author();
        pages = faker.number().numberBetween(50,700);
    }


    public String toString() {
        return "წიგნი: \"" + title + "\" | ავტორი: " + author + " | გვერდები: " + pages;
    }


    public static void main(String[] args) {
        BookTest book = new BookTest();
        System.out.println(book);
    }







}
