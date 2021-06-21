package ro.ctrln.java.collections.set;

import ro.ctrln.java.collections.model.Person;
import ro.ctrln.java.collections.model.PersonComparable;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BittnetSortedSet {

    public static void main(String[] args) {

        SortedSet<String> strings = new TreeSet<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");

        System.out.println("strings: " + strings);

        SortedSet<PersonComparable> persons = new TreeSet<>();

        persons.add(new PersonComparable("John", "Doe",30,"engineer"));
        persons.add(new PersonComparable("John", "Doe",27,"engineer"));
        persons.add(new PersonComparable("Emily", "Lane",29,"java developer"));
        System.out.println("person: " + persons);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("John", "Doe",30,"engineer"));
        System.out.println("personSet: " + personSet);
    }
}
