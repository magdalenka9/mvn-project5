package org.example;

import net.datafaker.Faker;

public class StudentTest {


    private String name;
    private int age;
    private String grade;


    public StudentTest() {
        Faker faker = new Faker();
        name = faker.name().fullName();
        age = faker.number().numberBetween(18, 30);
        grade = faker.educator().course();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Method to print Student info
    public void printInfo() {
        System.out.println(
                "სახელი = " + name +
                        ", ასაკი = " + age +
                        ", კლასი = " + grade
        );
    }


    public static void main(String[] args) {
        StudentTest student = new StudentTest();  // Faker-ით შექმნილი
        student.printInfo();


        student.setName("Giorgi");
        student.setAge(22);
        student.setGrade("Mathematics");
        student.printInfo();
    }
}








