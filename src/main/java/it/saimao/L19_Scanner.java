package it.saimao;

import java.util.Scanner;

public class L19_Scanner {
    public static void main(String[] args) {

        // String program
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Who is the creator of Java?");
//        String input = sc.nextLine();
//        System.out.println("Java is created by " + input);

        // Calculator program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = sc.nextInt();
        System.out.println("Addition is " + (firstNumber + secondNumber));

    }
}
