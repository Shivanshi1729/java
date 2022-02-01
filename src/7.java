/*
    Java Program to Find Largest Element of an Array
*/

import java.util.Scanner;

class largest {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();

            if (n <= 0)
                System.exit(1);
            int arr[] = new int[n];
            System.out.println("Enter values: ");
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                } else {
                    System.out.println("\tPlease enter integer values.");
                    sc.next();
                    i--;
                }
            }

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
            System.out.println("Maximum element is " + max);
        }
        sc.close();
        System.exit(0);
    }
}