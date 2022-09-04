package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        /* Понижающее приведение */
        Student st = (Student) fresh;
        /* Повышающее приведение */
        Object obj = fresh;
    }
}
