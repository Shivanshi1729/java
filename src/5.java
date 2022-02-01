/*
    Java Program to Convert Octal Number to Decimal and vice-versa.
*/

import java.util.Scanner;

class octal {

    public static void main(String[] args) {
        long a;
        byte choice = 0;

        System.out.println("1. Octal to decimal.");
        System.out.println("2. Decimal to octal.");
        System.out.println("0. Exit.");
        System.out.println("Enter your choice:\t");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextByte()) {
            choice = sc.nextByte();
            if (choice == 1) {
                System.out.print("Enter the number: ");
                if (sc.hasNextLong()) {
                    a = sc.nextLong();
                    long ans = 0;
                    long temp = a;
                    long pow = 1;
                    while (temp > 0) {
                        if (temp % 10 >= 0 && temp % 10 <= 7) {
                            ans += (temp % 10) * pow;
                            pow *= 8;
                        } else {
                            System.out.println("Enter a valid octal number..");
                            System.exit(1);
                        }
                        temp /= 10;
                    }
                    System.out.println("Decimal equivalent:: " + ans);
                } else {
                    System.out.println("Enter a valid octal number.");
                }
            } else if (choice == 2) {
                System.out.print("Enter the number: ");
                if (sc.hasNextLong()) {
                    a = sc.nextLong();
                    String s = new String();
                    long temp = a;
                    while (temp > 0) {
                        s = (char) ((temp % 8) + '0') + s;
                        temp /= 8;
                    }
                    System.out.println("The octal equivalent:: " + s);
                } else {
                    System.out.println("Enter a valid decimal number.");
                }
            } else if (choice != 0) {
                System.out.println("Enter valid choice.\n");
            }
        }
        sc.close();
        System.exit(0);
    }
}