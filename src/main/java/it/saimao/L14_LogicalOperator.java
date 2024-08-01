package it.saimao;
/*
AND
true && true = true (Both true then true)
true && false = false
false && true = false
false && false = false

OR
true || true = true (Either true then true)
true || false = true
false || true = true
false || false = false

 */
public class L14_LogicalOperator {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        boolean and = x > y && x != y;
        System.out.println(and);
        boolean or = x == y || x < y; // false or true
        System.out.println(or);
        boolean not = !(x > y && x != y);
        System.out.println(not);

    }
}
