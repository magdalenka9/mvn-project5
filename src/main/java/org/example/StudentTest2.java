package org.example;

import net.datafaker.Faker;

public class StudentTest2 {

    private String studentId;
    private String name;

    public StudentTest2(){
        Faker faker = new Faker();
        name=faker.name().fullName();
        studentId = faker.idNumber().valid();
        }



    public String getStudentId() {
        return studentId;



    }




}
