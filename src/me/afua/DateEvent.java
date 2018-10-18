package me.afua;

import java.util.ArrayList;

public class DateEvent {
    Person asking;
    Person accepting;

    ArrayList <String> events;

    public Person getAsking() {
        return asking;
    }

    public void setAsking(Person asking) {
        this.asking = asking;
    }

    public Person getAccepting() {
        return accepting;
    }

    public void setAccepting(Person accepting) {
        this.accepting = accepting;
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public void somethingHappened(String whatHappened)
    {
        events.add(whatHappened);
    }
}
