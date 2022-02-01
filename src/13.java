/*
    Using the switch statement, write a menu-driven program to calculate the
    maturity amount of a bank deposit. The user is given the following options:
    (i) Term Deposit 
    (ii) Recurring Deposit 
    For option (i) 
    accept Principal (p),
    rate of interest (r) and 
    time period in years (n). 
    Calculate and output the maturity amount (a) receivable using the 
    formula a = p[1 + r / 100]n. 
    
    For option (ii) 
    accept monthly instalment (p), 
    rate of interest (r) and time
    period in months (n). 
    Calculate and output the maturity amount (a) receivable
    using the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12. 
    
    For an incorrect option, an appropriate error message should be displayed.
*/

import java.util.Scanner;

class menus {

    public static void main(String[] args) {
        System.out.println("1) Term Deposit");
        System.out.println("2) Recurring Deposit");
        System.out.print("Enter your choice: ");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            if (choice == 1) {
                double p, r, n, a;
                System.out.print("Enter principal: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                p = sc.nextDouble();
                System.out.print("Enter rate: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                r = sc.nextDouble();
                System.out.println("Enter time: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                n = sc.nextDouble();
                a = p * Math.pow(1 + r / 100, n);
                System.out.println("Maturity amount: " + a);
            } else if (choice == 2) {
                double p, r, n, a;
                System.out.println("Enter principal: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                p = sc.nextDouble();
                System.out.println("Enter rate: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                r = sc.nextDouble();
                System.out.println("Enter time: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter valid amount.");
                    sc.next();
                }
                n = sc.nextDouble();
                a = p * n + p * (n * (n + 1) / 2) * (r / 100) * (1 / 12);
                System.out.println("Maturity amount: " + a);
            } else {
                System.out.println("Enter valid option.");
            }
        }
        sc.close();
        System.exit(0);
    }
}
