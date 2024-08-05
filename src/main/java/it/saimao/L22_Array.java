package it.saimao;

public class L22_Array {

    // CRUD -> Create, Read, Update, Delete

    public static void main(String[] args) {
        int number = 10;

        // Create an array
        int[] numbers = {number, 50, 100, 500, 1000, 2000, 4000};
        char[] chars = {'a', 'b', 'c', 'd'};
        String[] names = {"Luffy", "Zoro", "Sanji"};
        System.out.println("Length of array - " + numbers.length);

        // Read value from array
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];
        System.out.println(firstNumber + lastNumber);

        // Update
        System.out.println("Before Update - " + numbers[0]);
        numbers[0] = 10000; // Re-assign array value
        System.out.println("After Update - " + numbers[0]);

    }
}
