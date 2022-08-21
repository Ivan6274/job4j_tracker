package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("I'm the great oracle, what's your question?");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        System.out.println("Your question is - '" + question + "'");
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> System.out.println("Yes");
            case 1 -> System.out.println("No");
            case 2 -> System.out.println("Maybe");
        }
    }
}
