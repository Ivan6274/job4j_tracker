package ru.job4j.oop;

public class Vehicle {
    public static void main(String[] args) {
        Vechicle plane = new Plane();
        Vechicle bus = new Bus();
        Vechicle train = new Train();

        Vechicle[] vhs = new Vechicle[]{plane, bus, train};
        for (Vechicle a : vhs) {
            a.move();
        }
    }
}
