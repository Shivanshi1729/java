/*
    Java Program to Add Two Dates
*/

import java.util.Scanner;

class add_date {

    public static String getDate(long days) {
        long m = 0, y = 0, d = 0;
        y = (long) (days / 365.25);
        // System.err.println("year: " + y);
        days = days - (long) (y * 365.25);
        if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
            // leap
            int mon[] = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 };
            for (int i = 11; i >= 0; i--) {
                if (days >= mon[i]) {
                    m = i + 1;
                    days -= mon[i];
                }
            }
        } else {
            int mon[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
            for (int i = 11; i >= 0; i--) {
                if (days > mon[i]) {
                    m = i + 1;
                    days -= mon[i];
                }
            }
        }
        // System.err.println("Month: " + m);
        d = days;
        // System.err.println("Date: " + d);
        String s = Long.toString(y + 1) + "-" + Long.toString(m) + "-" + Long.toString(d);
        return s;
    }

    public static int countMonthDays(int n, int y) {
        int mon[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (n == 1)
            return 0;
        else if (n == 2)
            return 31;
        else {
            int sum = ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) ? 1 : 0;
            for (int i = 0; i < n - 1; i++) {
                sum += mon[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two date (format YYYY-MM-DD): ");
        String date1[] = sc.nextLine().split("-");
        String date2[] = sc.nextLine().split("-");

        try {
            long total1 = (long) ((Integer.parseInt(date1[0]) - 1) * 365.25);
            total1 += countMonthDays(Integer.parseInt(date1[1]), Integer.parseInt(date1[0]));
            total1 += Integer.parseInt(date1[2]);
            long total2 = (long) ((Integer.parseInt(date2[0]) - 1) * 365.25);
            total2 += countMonthDays(Integer.parseInt(date2[1]), Integer.parseInt(date2[0]));
            total2 += Integer.parseInt(date2[2]);
            long sum = total1 + total2;
            // System.out.println("Sum:: " + sum);
            System.out.println("Sum:: " + getDate(sum));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Enter valid values.");
        }
        sc.close();
    }
}