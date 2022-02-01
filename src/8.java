/*
    Java Program to Count the Number of Vowels and Consonants in a Sentence
*/

 import java.util.Scanner;

 class vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();

        System.out.println("Enter a sentence: ");
        if (sc.hasNextLine()) {
            s = sc.nextLine();

            int noVowels = 0;
            int noConsonants = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        noVowels++;
                    } else {
                        noConsonants++;
                    }
                }
            }
            System.out.println("No of vowels: "+noVowels + " No of Consonants: " + noConsonants);
        }
        sc.close();
        System.exit(0);
    }
}