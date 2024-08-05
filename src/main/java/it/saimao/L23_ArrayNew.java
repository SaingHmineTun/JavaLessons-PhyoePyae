package it.saimao;


/*
Default value
1. byte, short, int, long, float, double, char => 0
2. boolean => false
3. Reference => null

One Piece => 2_147_483_648
Demon Slayer => Sai Mao (စိုင်းမောဝ်)

 */
public class L23_ArrayNew {
    public static void main(String[] args) {

        String[] names = new String[2];
        names[0] = "Roronoa"; // {'R', 'o', 'r', 'o', 'n', 'o', 'a'}
        names[1] = "Zoro";

        System.out.println("First name - " + names[0]);
        System.out.println("Last name - " + names[1]);

    }
}
