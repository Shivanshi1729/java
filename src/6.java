/*
    Java Program to Convert Binary Number to Octal and vice-versa.
*/

import java.util.Scanner;

 class binary_octal {
    public static void main(String[] args) {
        long a;
        byte choice = 0;

        System.out.println("1. Binary to Octal.");
        System.out.println("2. Octal to binary.");
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
                    // binary to decimal then decimal to octal
                    while (temp > 0) {
                        if (temp % 10 == 0 || temp % 10 == 1) {
                            ans += (temp % 10) * pow;
                            pow *= 2;
                        } else {
                            System.out.println("Enter a valid binary number..");
                            System.exit(1);
                        }
                        temp /= 10;
                    }
                    temp = ans;
                    String s = new String();
                    while (temp > 0) {
                        s = (char) ((temp % 8) + '0') + s;
                        temp /= 8;
                    }
                    System.out.println("The octal equivalent:: " + s);
                } else {
                    System.out.println("Enter a valid binary number.");
                }
            } else if (choice == 2) {
                System.out.print("Enter the number: ");
                if (sc.hasNextLong()) {
                    a = sc.nextLong();
                    String s = new String();
                    long temp = a;
                    // octal to decimal then decimal to binary
                    long ans = 0;
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
                    temp = ans;
                    while (temp > 0) {
                        s = (char) ((temp % 2) + '0') + s;
                        temp /= 2;
                    }
                    System.out.println("The binary equivalent:: " + s);
                } else {
                    System.out.println("Enter a valid Octal number.");
                }
            } else if (choice != 0) {
                System.out.println("Enter valid choice.\n");
            }
        }
        sc.close();
        System.exit(0);
    }
}