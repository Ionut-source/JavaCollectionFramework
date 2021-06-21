package ro.ctrln.java.collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BittnetQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        System.out.println(queue);

        queue.addAll(Arrays.asList("Six", "Seven"));
        System.out.println("queue dupa ce am adaugat Six si Seven: " + queue);

        queue.removeAll(Arrays.asList("One", "Five"));
        System.out.println("queue dupa ce am sters One si Five: " + queue);

        //peek() intoarce capul cozii dar nu il sterge
        System.out.println("Capul cozii: " + queue.peek());
        System.out.println("Coada dupa peek(): " + queue);

        //poll() intoarce capul cozii si il sterge
        System.out.println("Capul cozii: " + queue.poll());
        System.out.println("Coada dupa poll(): " + queue);

        //offer() adauga un element si intoarce true sau false daca elementul a fost sau nu adaugat
        boolean offered = queue.offer("Offered Element");
        System.out.format("Element adaugat %b\n" , offered);
        System.out.println("Coada dupa offer(): " + queue);

        String head = queue.element();
        System.out.println("Capul cozii este: " + head);
        System.out.println("Coada dupa element: " + queue);
    }
}
