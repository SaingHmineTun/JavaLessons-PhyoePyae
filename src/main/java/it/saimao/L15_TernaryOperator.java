package it.saimao;

public class L15_TernaryOperator {
    public static void main(String[] args) {
        int x = 13981;
        String gender = x % 2 == 0 ? "Male" : "Female";
        System.out.println(gender);
    }
}
