package it.saimao;

public class L11_UnaryOperator {
    public static void main(String[] args) {
        // 1. Negative or Positive
        int i = -1;

        // 2. Not operator
        boolean active = true;
        active = !false;

        // 3. increment (++) or decrement (--)
        int number = 10;
        number--; // number = number + 1;

        // 3.1 prefix vs suffix
        // prefix => put operator in front of operand ( ++ number )
        // suffix / postfix => put operator behind operand ( number -- )
        int num = 10;
        // System.out.println(++ num); // do then take
        System.out.println(num--); // take then do
        System.out.println(num);

    }
}
