package ro.ctrln.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BittnetList {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        ArrayList<String>aStrings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>(3);

        int element = 10;
        integers.add(1);
        integers.add(Integer.valueOf(10));
        integers.add(element);
        integers.add(200);
        System.out.println("integers cu valori initiale: " + integers);

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        System.out.println("strings cu valori initiale: " + strings);

        aStrings.add("Four");
        aStrings.add("Five");
        System.out.println("aStrings cu valori initiale: " + aStrings);

        System.out.println("Returnarea elementelor dintr-o lista!");
        System.out.println(strings.get(0));
        System.out.println(integers.get(2));
        //System.out.println(integers.get(100));

        System.out.println("Marimea listei strings este: " + strings.size());
        System.out.println("Marimea listei integers este: " + integers.size());

        strings.addAll(aStrings);
        System.out.println("strings cu valorile din aStrings adaugate: " + strings);
        System.out.println("Marimea listei strings este: " + strings.size());

        integers.addAll(Arrays.asList(300,400,500));
        System.out.println("integers cu valorile dintr-o lista creata cu Arrays.asList: " + integers);
        System.out.println("Marimea listei integers este: " + integers.size());

        integers.addAll(2,Arrays.asList(1000,2000,3000));
        System.out.println("integers cu valorile dintr-o lista creata cu Arrays.asList la un anumit index: " + integers);
        System.out.println("Marimea listei integers este: " + integers.size());

        strings.remove("Four");
        System.out.println("strigs dupa ce am sters -Four- : " + strings);
        System.out.println("Marimea listei string este: " + strings.size());

        strings.remove(3);
        System.out.println("strigs dupa ce am sters de la indexul 3 : " + strings);
        System.out.println("Marimea listei string este: " + strings.size());

        strings.removeAll(Arrays.asList("One", "Three"));
        System.out.println("strigs dupa ce am sters -One si Three- : " + strings);

        System.out.println("integers contine 1000? : " + integers.contains(1000));
        System.out.println("integers contine 1, 10, 3000, 400? : " + integers.containsAll(Arrays.asList(1, 10, 3000, 400)));

        strings.clear();
        System.out.println("Este lista strings goala? : " + strings.isEmpty());


    }
}
