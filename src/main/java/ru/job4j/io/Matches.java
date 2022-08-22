package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First игрок" : "Second игрок";
            System.out.println(player + " введите число от 1 до 3, но не больше оставшегося количества спичек:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count = count - matches;
                turn = !turn;
                System.out.println("Осталось " + count + "спичек");
            } else {
                System.out.println("Вы ввели неправильное число, введите еще раз");
            }
        }
        if (!turn) {
            System.out.println("Выиграл First игрок");
        } else {
            System.out.println("Выиграл Second игрок");
        }
    }
}