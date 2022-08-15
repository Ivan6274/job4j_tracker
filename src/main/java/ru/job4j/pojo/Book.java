package ru.job4j.pojo;

public class Book {
    private String bookName;
    private int countOfPages;

    public Book(String bookName, int countOfPages) {
        this.bookName = bookName;
        this.countOfPages = countOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}
