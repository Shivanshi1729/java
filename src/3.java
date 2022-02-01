/*
    Java Program to Display Armstrong Number Between Two Intervals (Numbers must
    be taken as command line arguments).
*/

class armstrong {
    public static void usage() {
        System.out.println("Description: Find armstrong numbers between given range.");
        System.out.println("Usage:");
        System.out.println("\tcommand [no1] [no2]");
        System.out.println("no1 - starting number");
        System.out.println("no2 - end number");
    }

    public static boolean isArmgstrom(int a) {
        int d = 0;
        int temp = a;
        while (temp > 0) {
            d++;
            temp /= 10;
        }

        long sum = 0;
        temp = a;
        while (temp > 0) {
            sum += (long) Math.pow(temp % 10, d);
            temp /= 10;
        }
        if (sum == a) {
            return true;
        } else {
            return false;
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

            if (a > b) {
                throw new Exception("no1 should be smaller than no2");
            }
            for (int i = a; i <= b; i++) {
                if (isArmgstrom(i)) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid values..");
            usage();
            System.exit(1);
        } catch (Exception e) {
            System.out.println("\t" + e.getMessage());
            System.out.println("Please enter valid values..");
            usage();
            System.exit(1);
        }
        System.exit(0);
    }
}
