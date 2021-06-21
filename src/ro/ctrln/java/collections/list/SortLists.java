package ro.ctrln.java.collections.list;

import ro.ctrln.java.collections.model.Person;
import ro.ctrln.java.collections.model.PersonComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortLists {

    public static void main(String[] args) {

        ArrayList<PersonComparable> personComparables = new ArrayList<>();
        personComparables.add(new PersonComparable("Joe", "Dan", 28, "Programmer"));
        personComparables.add(new PersonComparable("Joe", "Dan", 23, "Programmer"));
        personComparables.add(new PersonComparable("King ", "Julian", 25, "Clown"));
        personComparables.add(new PersonComparable("Ada", "Lovelace", 30, "Programmer"));
        System.out.println("Array list inainte de ordonare: " + personComparables);

        Collections.sort(personComparables);
        System.out.println("Array list dupa ordonare: " + personComparables);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Joe", "Dan", 28, "Programmer"));
        persons.add(new Person("Joe", "Dan", 23, "Programmer"));
        persons.add(new Person("King ", "Julian", 25, "Clown"));
        persons.add(new Person("Ada", "Lovelace", 30, "Programmer"));
        System.out.println("Array list inainte de ordonare: " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person personOne, Person personTwo) {
                return personOne.getAge().compareTo(personTwo.getAge());
            }
        });
        System.out.println("Array list dupa ordonare: " + persons);
    }
}
