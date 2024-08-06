package it.saimao;

public class L29_InfiniteWhileLoop {
    public static void main(String[] args) {
        boolean active = true;
        System.out.println("Start");
        while (active) { // infinite loop
            System.out.println("I am while loop!");
        }
        System.out.println("End");
    }
}
