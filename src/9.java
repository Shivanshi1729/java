/*
    Java Program to Calculate Difference Between Two Time Periods
*/

import java.util.Scanner;

class timediff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time1[];
        String time2[];

        System.out.println("Enter two time(format HH:MM:SS):: ");
        time1 = sc.nextLine().split(":");
        time2 = sc.nextLine().split(":");

        try {
            long total1 = Integer.parseInt(time1[0]) * 3600 + Integer.parseInt(time1[1]) * 60
                    + Integer.parseInt(time1[2]);
            long total2 = Integer.parseInt(time2[0]) * 3600 + Integer.parseInt(time2[1]) * 60
                    + Integer.parseInt(time2[2]);
            long ans = Math.abs(total1 - total2);
            String a = Long.toString((long) (ans / 3600)) + ":" + Long.toString((long) ((ans % 3600) / 60)) + ":"
                    + Long.toString((long) ((ans % 3600) % 60));
            System.out.println("Difference: " + a);
        } catch (Exception e) {
            System.out.println("Enter valid time.");
        }
        sc.close();
        System.exit(0);
    }
}