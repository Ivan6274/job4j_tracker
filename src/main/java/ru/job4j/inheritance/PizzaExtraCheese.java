package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    public String name() {
        String name = " + extra cheese";
        return super.name() + name;
    }
}
