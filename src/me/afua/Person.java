package me.afua;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private ArrayList<DateEvent> datesWith;

    public Person() {

    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<DateEvent> getDatesWith() {
        return datesWith;
    }

    public void setDatesWith(ArrayList<DateEvent> datesWith) {
        this.datesWith = datesWith;
    }

    public void addADate(DateEvent specialDate)
    {
        datesWith.add(specialDate);
    }
}
