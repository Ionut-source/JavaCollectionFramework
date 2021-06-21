package ro.ctrln.java.collections.vectors;

import java.util.Arrays;
import java.util.Vector;

public class BittnetVector {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(7);
        vector.add(10);
        vector.add(12);
        vector.add(15);
        vector.add(19);
        vector.add(31);
        vector.add(33);

        System.out.println("Elementul de pe pozitia 0 este: " + vector.get(0));

        System.out.println("Marimea vectorului este: " + vector.size());
        System.out.println("Capacitatea vectorului este: " + vector.capacity());

        vector.remove(10);
        System.out.println("Marimea vectorului este: " + vector.size());
        System.out.println("Capacitatea vectorului este: " + vector.capacity());

        vector.removeAll(Arrays.asList(3,4,7));
        System.out.println("Marimea vectorului este: " + vector.size());
        System.out.println("Capacitatea vectorului este: " + vector.capacity());

    }
}
