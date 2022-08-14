package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public String name() {
        String name = " + extra tomato";
        return super.name() + name;
    }
}
