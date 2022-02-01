/*
    Program to find if the given numbers are Friendly pair or not (Amicable or
    not). Friendly Pair are two or more numbers with a common abundance. 
    Input & Output format: 
    Input consists of 2 integers. 
    The first integer corresponds to number 1 and the second integer corresponds 
    to number 2. 
    If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair. 
    For example, 
    6 and 28 are Friendly Pair. 
    (Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.
*/

import java.util.Scanner;

class friendly{

    public static int divisorSum(int n) {
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no1, no2;
        System.out.println("Enter two integer");
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid integer.");
            sc.next();
        }
        no1 = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid integer.");
            sc.next();
        }
        no2 = sc.nextInt();
        if (divisorSum(no1) == divisorSum(no2)) {
            System.out.println("Abundant Numbers");
        } else {
            System.out.println("Not Abundant Numbers");
        }
        sc.close();
        System.exit(0);
    }
}