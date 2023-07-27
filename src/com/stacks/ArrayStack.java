package com.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;//array named stack, which will be used to store the elements of the stack
                             // array type is Employee,indicating that this stack is designed to hold objects of the Employee
    private int top;//keep track of the index of the top element in the stack

    public ArrayStack(int capacity) {//constructor
        stack = new Employee[capacity];

    }

    public void push(Employee employee) {
        if (top == stack.length) { //if stack is full
            //need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length); //copy stack array elements into new array
            stack=newArray; //assign newArray to stack
        }
        stack[top++]=employee; //assign employee to top and increment
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee=stack[--top];
        stack[top]=null;
        return employee;

    }

    public Employee peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return stack[top -1];
    }

    public int size(){
        return top;
    }


    public boolean isEmpty(){
        return top==0;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

}