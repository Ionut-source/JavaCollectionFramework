package ro.ctrln.java.collections.vectors;

import java.util.Stack;

public class BittnetStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(10);
        stack.add(100);
        stack.add(1000);

        System.out.println(stack);

        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        stack.remove(3);
        System.out.println(stack);

        Integer top = stack.pop();
        System.out.println("Varful stivei: " + top);
        System.out.println(stack);

        System.out.println("Pozitia in stiva a lui 10 este: " + stack.search(10));
    }
}
