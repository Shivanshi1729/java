/* 
    The problem to rearrange positive and negative numbers in an array .
    Method: This approach moves all negative numbers to the beginning and positive numbers
    to the end but changes the order of appearance of the elements of the array.
    Steps:
    i. Declare an array and input the array elements.
    ii. Start traversing the array and if the current element is negative, swap the current
    element with the first positive element and continue traversing until all the elements
    have been encountered.
    iii. Print the rearranged array.
    Test case:
        Input:
        1 -1 2 -2 3 -3
        Output: 
        -1 -2 -3 1 3 2
*/

import java.util.Scanner;

class shi_2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        int i0 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i0];
                arr[i0] = arr[i];
                arr[i] = temp;
                i0++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        System.exit(0);
    }

}
