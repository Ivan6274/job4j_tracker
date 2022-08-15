package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petrov Petr Petrovich");
        student.setId(22);
        student.setDateOfStarEdu(new Date());

        System.out.println("Student's name: " + student.getFio() + System.lineSeparator()
                + "Id group is " + student.getId() + System.lineSeparator()
                + "Date starting of education is " + student.getDateOfStarEdu());
    }
}
