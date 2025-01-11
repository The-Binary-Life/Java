package org.tbl.pkg;

public class CustomStack {
    //Instance variables
    int[] elements; //We will keep integers in this stack
    int stackTop; //This is the pointer to the stack top

    //Constructor
    public CustomStack(int capacity){
        elements = new int[capacity]; //defining the stack with its size
        stackTop = -1; //This is use to indicate the stack is empty
    }

    //Operations using instance methods
    public void push(int element){
        elements[++stackTop] = element; //Adding element at the current stack top
    }

    public int pop(){
        return elements[stackTop--]; //removing the element at the current stack top
    }

    public int peek(){
        return elements[stackTop]; //Returns the element at the current stack top
    }

    public boolean isEmpty(){
        return stackTop < 0; //if stackTop is < 0, it means the array is empty
    }

    public boolean isFull(){
        return stackTop == elements.length - 1;
    }
}
