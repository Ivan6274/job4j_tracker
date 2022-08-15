package ru.job4j;

import java.time.format.DateTimeFormatter;

public class StartUI {
    Item item = new Item();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    String dataTime = item.getCreated().format(formatter);

    public void getLocalTime() {
        System.out.println("Текущие дата и время после форматирования: " + dataTime);
    }
}
