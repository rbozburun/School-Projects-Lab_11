package demo;

import stack.Stack;
import stack.StackImpl;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
