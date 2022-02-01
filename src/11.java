/*
    Java Program to Check if a String is Numeric.
*/

import java.util.Scanner;

 class numeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if (s.matches("[0-9]*$")) {
            System.out.println("Numeric");
        } else {
            System.out.println("Not numeric.");
        }
        sc.close();
        System.exit(0);
    }
}