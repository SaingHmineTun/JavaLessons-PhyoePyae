package it.saimao;

import java.util.Scanner;

public class L26_If {

    // Ctr + Alt + L

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's grade");
        int grade = sc.nextInt();

        if (grade > 0 && grade <= 4)  // boolean expression => code that returns boolean value
            System.out.println("PRIMARY");
        else if (grade > 4 && grade <= 8)
            System.out.println("MIDDLE");
        else if (grade >= 9 && grade <= 10) {
            System.out.println("HIGH");
        } else {
            System.out.println("HEAD MASTER");
        }
        System.out.println("End of if");
    }
}
