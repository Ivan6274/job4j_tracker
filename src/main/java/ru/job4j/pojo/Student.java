package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private int id;
    private Date dateOfStarEdu;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfStarEdu() {
        return dateOfStarEdu;
    }

    public void setDateOfStarEdu(Date dateOfStarEdu) {
        this.dateOfStarEdu = dateOfStarEdu;
    }
}
