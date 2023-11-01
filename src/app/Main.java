package app;

import algotithms.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a sorting array application!");
        System.out.print("Please enter the size of array: ");

        int size = sc.nextInt();

        System.out.println("Do you want to generate random array? (Y/N)");
        System.out.print("Your choice: ");
        String choice = sc.next().toUpperCase();

        divider();

        int[] array = new int[size];

        if(choice.equals("Y")){
            for(int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }else{
            System.out.println("Please enter the elements of array: ");
            for(int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }
            divider();
        }
        System.out.println("Your array : ");
        printArray(array);
        divider();

        System.out.println("Choose the algorithm you want to use: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");

        int option;
        do{
        System.out.print("Your option: ");
        option = sc.nextInt();
        divider();

        if(option < 1 || option > 5)
            System.out.println("Invalid option! Please choose again!");
        }while(option < 1 || option > 5);


        long startTime = System.nanoTime();
        String algorithm = switch (option) {
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

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.printf("\nYour array after " + algorithm +" algorithm: \n");

        printArray(array);

        divider();
        System.out.println("Time taken to sort array: " + timeElapsed + " nano seconds");
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
