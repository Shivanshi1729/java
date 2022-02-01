/*
    Java Program to Find GCD of two Numbers (Numbers must be taken as command
    line arguments).
*/

class gcdd {
    public static void usage() {
        System.out.println(
                "Description: Find GCD of two numbers.\nUsage:\n\tcommand [no1] [no2]\nno1 - number 1\nno2 - number2\n");
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            usage();
            System.exit(1);
        }
        try {
            int a, b;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            int ans = gcd(a, b);
            System.out.println("The GCD of the numbers is: " + ans);
        } catch (Exception e) {
            System.out.println("Please enter valid values..\n");
            usage();
            System.exit(1);
        }
        System.exit(0);
    }
}
