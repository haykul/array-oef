package be.intecbrussel;

import java.util.Scanner;

public class oefenen2 {
    public static void main(String args[]) {

        int i, j, conv;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 numbers :");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        j = 5 - 1;
        for (i = 0; i < j; i++) {
            conv = arr[i];
            arr[i] = arr[j];
            arr[j] = conv;
            j--;
        }

        System.out.print("\nConverted Array :");
        for (i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}