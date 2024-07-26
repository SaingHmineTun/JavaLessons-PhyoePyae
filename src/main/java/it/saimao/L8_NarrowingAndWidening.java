package it.saimao;

public class L8_NarrowingAndWidening {
    public static void main(String[] args) {

        // Widening
        byte b = 127;
        short s = b; // byte (1) => short (2)
        int i = s; // short (2) => int (4)

        // Narrowing
        short numShort = 10000;
        byte numByte = (byte) numShort;
        System.out.println(numByte);

    }
}
