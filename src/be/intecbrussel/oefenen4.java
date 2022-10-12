package be.intecbrussel;

import java.util.Scanner;

public class oefenen4 {
    public static void main(String args[]) {
        int i, en = 0, on = 0;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers :");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                en = en + arr[i];
            } else {
                on = on + arr[i];
            }
        }
        System.out.println("\nEven Numbers :" + en);
        System.out.println("\nOdd Numbers :" + on);
    }
}
