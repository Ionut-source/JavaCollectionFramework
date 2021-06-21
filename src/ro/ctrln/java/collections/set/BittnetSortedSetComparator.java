package ro.ctrln.java.collections.set;

import ro.ctrln.java.collections.model.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class BittnetSortedSetComparator {

    public static void main(String[] args) {

        TreeSet<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person personOne, Person personTwo) {
                return personOne.getAge().compareTo(personTwo.getAge());
            }
        });

        personTreeSet.add(new Person("Joe","Dan",28,"Programmer"));
        personTreeSet.add(new Person("King ","Julian",25,"Clown"));
        personTreeSet.add(new Person("Ada","Lovelace",30,"Programmer"));

        System.out.println(personTreeSet);
    }
}
