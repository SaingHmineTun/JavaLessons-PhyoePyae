package it.saimao;

public class L25_2dArray {
    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'd'}; // 1d array => char
        char[][] characters = {
                chars,
                {'d', 'f', 'g'},
                {'h', 'i', 'j'}
        }; // char 2d array => char array

        // Get value from 2d array
        char[] row1 = characters[0];
        char ch = row1[2];
        System.out.println(ch);

        // character[row][column]
        System.out.println(characters[2][1]);

    }
}
