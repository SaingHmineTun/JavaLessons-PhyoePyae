package it.saimao;

public class L18_Print {
    public static void main(String[] args) {
        System.out.println("One");
        System.out.println("Two");

        String name = "java";
        int age = 29;
        boolean active = true;
        String father = "James Gostling";

        System.out.println("My name is " + name + ". I am " + age + " years old. My current active status is " + active + "!");
        System.out.printf("My name is %s. I am %d years old. My current active status is %b! My father is %s", name, age, active, father);

    }
}
