package be.intecbrussel;

import java.util.Scanner;

public class oefenen1 {
    public static void main(String args[]) {
        // oefenen 1 Schrijf een programma dat 10 int's vraagt aan een gebruiker en deze in een array plaatst.
        // Print dezearray dan uit op het scherm.
        int i, s = 0;
        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 number :");

        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int number : array) {
            System.out.print(number + " ");
        }

    }
}

