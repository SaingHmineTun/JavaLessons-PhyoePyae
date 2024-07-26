package it.saimao;

/*
int/double + int/double => int/double
int + int => int
int + double => double
double + double => double
double + int => double
 */
public class L10_ArithmeticOperator {
    public static void main(String[] args) {

        var x = 30;
        var y = 20;
        int z1 = x + y; // 30
        int z2 = x - y; // -10
        int z3 = x * y; // 200
        double z4 = x / 20.0; // 0
        System.out.println(z4);
        int z5 = x % y; // 10
        System.out.println(z5);

    }
}
