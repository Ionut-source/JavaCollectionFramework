package ro.ctrln.java.collections.map;

import ro.ctrln.java.collections.model.Person;

import java.util.Hashtable;

public class BittnetHashtable {

    public static void main(String[] args) {

        Hashtable<Person, String> personHashtable = new Hashtable<>();

        personHashtable.put(new Person("John", "Doe", 28, "programmer"), "One");
        personHashtable.put(new Person("Ada", "Lovelace", 23, "web developer"), "Two");
        personHashtable.put(new Person("Ada", "Lovelace", 23, "web developer"), "Three");

//  personHashtable.put(null,"null"); // arunca NullPointerException pt ca avem o cheie cu valoarea null
// personHashtable.put(new Person(),null); //arunca NullPointerException pt ca valoarea este null

        System.out.println(personHashtable);

        System.out.println(personHashtable.get(new Person("Ada", "Lovelace", 23, "web developer")));

    }
}
