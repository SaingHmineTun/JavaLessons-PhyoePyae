package it.saimao;

import java.util.Scanner;

public class L20_NextVsNextLine {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("My name is %s %s!", firstName, lastName);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter a name");
        String name = sc.next();
        System.out.println(name + " : " + x);

    }
}
