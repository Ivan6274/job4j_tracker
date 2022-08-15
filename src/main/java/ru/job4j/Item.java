package ru.job4j;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item() {
    }

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

    public LocalDateTime getCreated() {
        return created;
    }

    private LocalDateTime created = LocalDateTime.now();


}