package be.intecbrussel;

import java.util.Scanner;

public class oefen3 {
    public static void main(String[] args) {
        int arr[] = {13, 15, -8, 5, 13, 1, 2, -8, 7, 18};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(" " + arr[i]);
            }
        }
        String[] names = {"joey", "joey", "halil", "avi"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j])
                    System.out.println(" " + names[i]);
            }
        }
    }
}



