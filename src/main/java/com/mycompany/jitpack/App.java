package com.mycompany.jitpack;

import com.mycompany.multigraph.ArrayStack;
import com.mycompany.multigraph.MultiGraph;

/**
 * JitPack example
 *
 * @author colin
 */
public class App {

    /**
     * Program
     *
     * @param args args
     */
    public static void main( String[] args ) {

        MultiGraph multiGraph = new MultiGraph();

        ArrayStack arrayStack = new ArrayStack(50);

        System.out.println("Stack is full? - " + (arrayStack.sFull() ? "Yes" : "No"));
        System.out.println("Stack is empty? - " + (arrayStack.sEmpty() ? "Yes" : "No"));

        arrayStack.sPush(1);
        arrayStack.sPush(2);
        arrayStack.sPush(3);
        arrayStack.sPush(4);
        arrayStack.sPush(5);

        System.out.println("Popped off stack: " + arrayStack.sPop());

        System.out.println("Taking a peek off the top: " + arrayStack.sPeek());


    }
}
