package org.tbl.pkg;

/**
 * @author The_Binary_Life
 * @version 1.0.0
 */

public class Application {
    public static void main(String[] args) {
        //Creating the stack
        ViewableStack myStack = new ViewableStack(40);

        //Creating a string to push onto the stack
        String customString = ")-: esnes gnikam ma I epoh I";

        int length = customString.length();

        //Push the string char by char onto the stack
        for(int i = 0; i < length; i++){
            myStack.push(customString.charAt(i));
        }

        //Using the custom print method that we developed in previous exercise
        System.out.println("Original string: ");
        myStack.printStack();

        System.out.println("Reversed string: ");
        //Pop and print each char from the stack
        while(!myStack.isEmpty()){ //Checking if the stack is not empty
            System.out.print((char)myStack.pop()); //Start printing from the stackTop and continue till the stack becomes empty
        }
        System.out.println();
    }
}
