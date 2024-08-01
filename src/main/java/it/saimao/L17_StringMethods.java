package it.saimao;

public class L17_StringMethods {

    public static void main(String[] args) {

        int age = 18;
        String name = "Luffy";

        // To Lower & Upper case
        String lowerLetter = name.toLowerCase();
        System.out.println("To lower case - " + lowerLetter);
        String upperLetter = name.toUpperCase();
        System.out.println("To upper case - " + upperLetter);

        // isBlank & isEmpty
        String address = "    a    ";
        boolean empty = address.isEmpty();
        System.out.println("isEmpty : " + empty);
        boolean blank = address.isBlank();
        System.out.println("isBlank - " + blank);

        // equals, equalsIgnoreCase, startsWith, endsWith, contains
        String one = "one";
        String two = "two";
        System.out.println("Equals ignore case - " + one.equalsIgnoreCase("One"));
        System.out.println("Starts with - " + one.startsWith("on"));
        System.out.println("Ends with - " + one.endsWith("e"));
        System.out.println("Contains - " + one.contains("e"));

        // Concatenation
        String three = one.concat(two); // onetwo
        String four = one.concat(two.concat(three));
        /*
        plus operator
        1) int/float + int/float = addition
        2) int/float + String = concatenation
        3) String + int/float = concatenation
        4) String + String = concatenation
         */
        String five = one + two + three + four;
        System.out.println(five);

    }

}
