import java.util.Scanner;

void main() {

    // switch, case, break => :
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your grade...");
    String grade = sc.nextLine(); // one, One, ONE, ONe
    switch (grade.toLowerCase()) { // ONE => one
        case "one", "two", "three", "four":
            System.out.println("PRIMARY");
            break;
        case "five", "six", "seven", "eight":
            System.out.println("MIDDLE");
            break;
        case "nine", "ten":
            System.out.println("HIGH");
            break;
        default:
            System.out.println("HEAD MASTER'S OFFICE");
    }

}
