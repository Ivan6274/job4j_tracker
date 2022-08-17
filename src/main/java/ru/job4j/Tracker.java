package ru.job4j;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int count = 0;
        Item[] rsl = new Item[items.length];
        for (Item item : items) {
            if (item != null) {
                rsl[count] = item;
                count++;
            }
        }
        return  Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
       Item[] rsl = new Item[size];
       int count = 0;
        for (int index = 0; index < size; index++) {
            if(key.equals(items[index].getName())) {
                rsl[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}