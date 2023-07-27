package com.linkedlist;

import com.arrays.ArrayStack;
import com.arrays.Employee;

public class Main {
    public static void main(String[] args) {


        Employee janeSloan=new Employee("jane","Sloan",123);
        Employee katKot=new Employee("Kat","Kot",234);
        Employee billJill=new Employee("Bill","Jill",345);
        Employee smartBoy=new Employee("Smart","Boy",678);

        LinkedStack stack=new LinkedStack();
        stack.push((janeSloan));
        stack.push(katKot);
        stack.push(billJill);
        stack.push(smartBoy);

        System.out.println(stack.peek());
        stack.printStack();


    }
}