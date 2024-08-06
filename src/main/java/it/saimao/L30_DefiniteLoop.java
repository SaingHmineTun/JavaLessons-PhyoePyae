package it.saimao;

/*
1. initiate value
2. boolean expression
3. update value
 */
public class L30_DefiniteLoop {
    public static void main(String[] args) {

        // 1. initiate value
        int i = 0;
        // 2. boolean expression
        while (i <= 1000) {
            System.out.println(i);
            // 3. update value
            i = i + 1;
        }
        System.out.println("End of loop!");

    }
}
