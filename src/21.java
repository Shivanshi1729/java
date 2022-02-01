/* 
    Write a java program to create a class named 'Bank ' with the following data members:
        Name of depositor
        Address of depositor
        Account Number
        Balance in account
    Class 'Bank' has a method for each of the following:
        a. Generate a unique account number for each depositor
            For first depositor, account number will be 1001, 
            for second depositor it will be 1002 and so on
        b. Display information and balance of depositor
        c. Deposit more amount in balance of any depositor
        d. Withdraw some amount from balance deposited
        e. Change address of depositor
    After creating the class, do the following operations

    i. Enter the information (name, address, account number, balance) of the depositors.
        Number of depositors is to be entered by user.
    ii. Print the information of any depositor.
    iii.Add some amount to the account of any depositor and then display final information
        of that depositor
    iv. Remove some amount from the account of any depositor and then display final
        information of that depositor
    v. Change the address of any depositor and then display the final information of that
        depositor
    vi. Randomly repeat these processes for some other bank accounts.
*/

import java.util.Scanner;

class bank {

    private String name;
    private String address;
    int account_no;
    double balance;
    Scanner sc;

    static int counter = 10001;

    bank() {
        sc = new Scanner(System.in);
        this.account_no = counter++;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Address: " + address);
        System.out.println("Account no: " + account_no);
        System.out.println("Balance: " + balance);
    }

    public void deposit() {
        System.out.println("Enter the deposit amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Enter valid amount.");
            sc.next();
        }
        double n = sc.nextDouble();
        this.balance += n;
    }
    
    public void withdraw() {
        System.out.println("Enter amount to withdraw:: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Enter valid amount.");
            sc.next();
        }
        
        double n = sc.nextDouble();
        if (n < 0 || n > this.balance) {
            System.out.println("Enter valid amount.");
            return;
        }
        this.balance -= n;
    }
    
    public void setAddress() {
        sc.nextLine();
        System.out.println("Enter new address:: ");
        String s = sc.nextLine();
        this.address = s;
    }
    
    public void input() {
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Address: ");
        this.address = sc.nextLine();
        System.out.println("Initital Balance: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Enter valid amount.");
            sc.next();
        }
        this.balance = sc.nextDouble();
        System.out.println("Account no: " + this.account_no);
    }

    protected void finalize() throws Throwable {
        sc.close();
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("Enter the no of customers: ");
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Enter valid amount.");
        }
        n = sc.nextInt();

        bank b[] = new bank[n];
        for (int i = 0; i < n; i++) {
            b[i] = new bank();
            b[i].input();
            // b[i].display();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("-------------------------------------");
            int a1 = (int) Math.random() * n;
            b[a1].setAddress();
            b[a1].deposit();
            b[a1].withdraw();
            System.out.println("=====================================");
            b[a1].display();
            System.out.println("=====================================");
            System.out.println("-------------------------------------");
        }
        sc.close();
    }
}
