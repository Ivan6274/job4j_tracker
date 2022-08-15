package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaForBeginner = new Book("Java for beginner", 111);
        Book javaForJunior = new Book("Java for junior", 222);
        Book javaForMiddle = new Book("Java for middle", 333);
        Book cleanCode = new Book("Clean code", 999);

        Book[] book = new Book[4];
        book[0] = javaForBeginner;
        book[1] = javaForJunior;
        book[2] = javaForMiddle;
        book[3] = cleanCode;

        for (Book bk : book) {
            System.out.println("The book " + bk.getBookName() + " have "
                    + bk.getCountOfPages() + " pages");
        }

        Book tmp = book[2];
        book[2] = book[0];
        book[0] = tmp;

        for (Book bk : book) {
            System.out.println("The book " + bk.getBookName() + " have "
                    + bk.getCountOfPages() + " pages");
        }

        for (Book bk : book) {
            if (bk.getBookName().equals("Clean code")) {
                System.out.println("The book " + bk.getBookName() + " have "
                        + bk.getCountOfPages() + " pages");
            }
        }
    }
}
