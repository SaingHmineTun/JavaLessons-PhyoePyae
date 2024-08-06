package it.saimao;

public class L28_NewSwitch {
    public static void main(String[] args) {

        // Min JDK = 17
        // Arrow switch
        int grade = 1;
        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("PRIMARY");
            case 5, 6, 7, 8 -> System.out.println("MIDDLE");
            case 9, 10 -> System.out.println("HIGH");
            default -> System.out.println("Head master's office!");
        }

    }
}
