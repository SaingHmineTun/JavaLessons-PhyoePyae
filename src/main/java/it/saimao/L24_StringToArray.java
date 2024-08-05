package it.saimao;

public class L24_StringToArray {
    public static void main(String[] args) {

        // 1. String => char[]
        String name = "Roronoa"; // {'R', 'o', 'r', 'o', 'n', 'o', 'a'}
        char[] names = name.toCharArray();
        System.out.println(names[4]);

        // 2. String => String[]
        String str = "one,two,three,four,five,six";
        String[] strArray = str.split(",");
        System.out.println(strArray[1]);

    }
}
