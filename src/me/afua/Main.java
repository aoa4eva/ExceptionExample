package me.afua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    ArrayList<Person> datingPool = new ArrayList<>();

    Person p = new Person("Simon");
    datingPool.add(p);
    p = new Person("Lisa");
    datingPool.add(p);

    p = new Person("Sarah");
    datingPool.add(p);

    p = new Person("Michael");
    datingPool.add(p);

    List<String> whatHappened = new ArrayList<String>(Arrays.asList("went to dinner with","saw a movie with","played chess with","went to a meetup with","visited"));
    DateEvent aDate;
    int dateCount=0;
    for(int i=0; i<10; i++)
    {

        Person[] theCouple = pairPeople(datingPool);
        if(theCouple!=null)
        {
            dateCount++;
            System.out.printf("Date %d: %s and %s are dating\n",dateCount,theCouple[0].getFirstName(),theCouple[1].getFirstName());
            aDate = new DateEvent();
            for(int dateEvents=0; dateEvents<3; dateEvents++)
            {
                aDate.events.add(whatHappened.get(new Random().nextInt(whatHappened.size())));
            }
            aDate.setAsking(theCouple[0]);

        }

    }

	// write your code here
    }

    public static Person[] pairPeople(ArrayList<Person> thePool)
    {
        Random random = new Random();
        Person firstPerson = thePool.get(random.nextInt(thePool.size()));
        Person secondPerson;
        do
        {
            secondPerson = thePool.get(random.nextInt(thePool.size()));
        }while(random.nextInt(thePool.size())!=thePool.indexOf(firstPerson));
        Person[] theCouple = new Person[2];
        theCouple[0] = firstPerson;
        theCouple[1]=secondPerson;
        if(theCouple[0]==theCouple[1])
        {
            System.out.println(theCouple[0].getFirstName()+" is free Saturday night");
            return null;
        }

        return theCouple;
    }
}
