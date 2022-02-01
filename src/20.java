/* 
    Write a java program to delete vowels from given string using StringBuffer class.
*/

import java.util.Scanner;

class shi_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = new String();
        if (sc.hasNext()) {
            a = sc.nextLine();
        }
        StringBuffer b = new StringBuffer(a);
        for (int i = 0; i < b.length(); i++) {
            char c = Character.toLowerCase(b.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                b.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("final : " + b);
        sc.close();
    }
}
