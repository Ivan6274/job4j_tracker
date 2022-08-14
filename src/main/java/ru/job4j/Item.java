package ru.job4j;

public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Item item1 = new Item("Ivan", 1);

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item() {
    }


}