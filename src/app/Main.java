package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a sorting array application!");
        System.out.print("Please enter the size of array: ");

        int size = sc.nextInt();

        divider();

        int[] array = new int[size];

        System.out.println("Please enter the elements of array: ");
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        divider();

        System.out.println("Choose the algorithm you want to use: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");

        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        divider();
        sc.close();
    }

    public static void divider() {
        System.out.println("--------------------------------------------------");
    }
}
