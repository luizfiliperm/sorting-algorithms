package app;

import algotithms.*;

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

        int choice;
        do{

        System.out.print("Your choice: ");
        choice = sc.nextInt();
        divider();
        if(choice < 1 || choice > 5)
            System.out.println("Invalid choice! Please choose again!");
        }while(choice < 1 || choice > 5);


        System.out.println("Your array before sorting: ");
        printArray(array);


        String algorithm = switch (choice) {
            case 1 -> {
                BubbleSort.sort(array);
                yield "Bubble Sort";
            }
            case 2 -> {
                SelectionSort.sort(array);
                yield "Selection Sort";
            }
            case 3 -> {
                InsertionSort.sort(array);
                yield "Insertion Sort";
            }
            case 4 -> {
                MergeSort.sort(array);
                yield "Merge Sort";
            }
            case 5 -> {
                QuickSort.sort(array);
                yield "Quick Sort";
            }
            default -> "";
        };


        System.out.printf("\nYour array after " + algorithm +" algorithm: \n");
        printArray(array);
        divider();

        sc.close();
    }

    public static void divider() {
        System.out.println("\n--------------------------------------------------");
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
