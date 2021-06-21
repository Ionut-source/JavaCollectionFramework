package ro.ctrln.java.collections.deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class BittnetDeque {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        deque.add("5");
        System.out.println(deque);

        deque.addFirst("first");
        System.out.println(deque);
        deque.addLast("last");
        System.out.println(deque);

        deque.addAll(Arrays.asList("-1","6","7","-2"));
        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.offerFirst("offerFirst"));
        System.out.println(deque.offerLast("offerLast"));
        System.out.println(deque);

    }
}
