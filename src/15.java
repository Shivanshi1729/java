/*
Program to replace all 0's with 1 in a given integer. Given an integer as an
input, all the 0's in the number has to be replaced with 1. For example,
consider the following number: 
Input: 102405 
Output: 112415 
Input: 56004
Output: 56114
*/

import java.util.Scanner;

class zeroone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a integer");
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid integer.");
            sc.next();
        }
        no = sc.nextInt();
        int temp = no;
        int n2 = 0;
        int m = 1;
        while (temp > 0) {
            if (temp % 10 == 0) {
                n2 = n2 + 1 * m;
            } else {
                n2 = n2 + (temp % 10) * m;

            }
            m *= 10;
            temp /= 10;
        }
        System.out.println("Result: " + n2);
        sc.close();
        System.exit(0);
    }
}
