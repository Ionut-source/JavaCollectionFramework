package ro.ctrln.java.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BittnetSet {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("One");
        System.out.println("strings: " + strings);

        HashSet<Integer> integers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1,4,5,2,1,3));
        System.out.println("integers: " + integers);

        System.out.format("Marimea setului strings este: %d" , + strings.size());

        System.out.println("Stergerea unui element dintr-un set!");
        strings.remove("Two");
        System.out.println("strings dupa ce am sters -Two- : " + strings);

        integers.removeAll(Arrays.asList(5,4,2));
        System.out.println("integers dupa ce am sters {5,4,2} : " + integers);

        System.out.format("Exista 3 in setul integers? %b\n" , integers.contains(3));

        strings.clear();
        System.out.format("Este strings gol? %b\n", strings.isEmpty());

    }
}
