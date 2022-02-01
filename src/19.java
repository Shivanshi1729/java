/* 
    String Handling in Java (using String and StringBuffer class)
    Program to find all the patterns of 0(1+)0 in the given string. 
    Given a string containing 0's and 1's, find the total number of 0(1+)0 
    patterns in the string and output it.
    
    0(1+)0 - There should be at least one '1' between the two 0's.
    
    For example, consider the following string.
    
    Input: 01101111010
    Output: 3
    
    Explanation:
    01101111010 - count = 1
    01101111010 - count = 2
    01101111010- count = 3
    
    Step to find all the patterns of 0(1+)0 in the given string
    i. Input the given string.
    ii. Scan the string, character by character.
    iii.If the given pattern is encountered, increment count.
    iv. Print count.
    Program to find all the patterns of 0(1+)0
*/

import java.util.Scanner;

class shi_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = new String();
        if (sc.hasNext()) {
            a = sc.nextLine();
        }
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                int j = -1;
                for (j = i + 1; j < a.length(); j++) {
                    if (a.charAt(j) == '0') {
                        break;
                    }
                }
                if (j + 1 != i && j != a.length()) {
                    counter++;
                    System.out.println("at index " + i + " to " + j);
                    i = j - 1;
                }
            }
        }
        System.out.println("Total count:: " + counter);
        sc.close();
    }
}
