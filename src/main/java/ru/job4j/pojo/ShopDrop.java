package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (index == products.length - 1) {
                products[index] = null;
                break;
            } else {
                products[index] = products[index + 1];
                products[index + 1] = null;
            }
            index++;
        }
        return products;
    }
}