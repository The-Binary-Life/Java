package org.tbl.pkg;

/**
 * @author The_Binary_Life
 * @version 1.0.0
 */

public class ViewableStack extends CustomStack{

    //Constructor: The child constructor implicitly calls the parent class constructor
    public ViewableStack(int capacity) {
        super(capacity);
    }

    //Additional method which is added for printing the stack
    public void printStack(){
        for(int i = 0; i <= stackTop; i++){
            System.out.print((char)elements[i]);
        }
        System.out.println();
    }
}
