package it.saimao;

import java.util.Random;

public class L21_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(100); // 0 to 99
        System.out.println(rnd);
    }
}
