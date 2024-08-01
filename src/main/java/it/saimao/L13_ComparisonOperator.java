package it.saimao;

/*
int/float < int/float = boolean
 */
public class L13_ComparisonOperator {
    public static void main(String[] args) {

        int x = 15;
        int y = 20;
        boolean isEqual = x == y;
        System.out.println(isEqual);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y); // greater than or equal
        System.out.println(x < y);
        System.out.println(x <= y); // less than or equal (< and ==)


    }
}
