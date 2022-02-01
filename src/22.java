/* 
    Define a class WordExample having the following description:
    Data members/instance variables:
    private String strdata : to store a sentence.
    Parameterized Constructor
        WordExample(String) : Accept a sentence which may be terminated by 
                either’.’, ‘? ’or ’!’ only. 
                The words may be separated by more than one blank space 
                and are in UPPER CASE.
    Member Methods:
        void countWord(): Find the number of words beginning and ending with a vowel.
        void placeWord(): Place the words which begin and end with a vowel at the beginning,
                          followed by the remaining words as they occur in the sentence.
*/

class WordExample {

    String strdata;

    WordExample(String s) {
        char end = s.charAt(s.length() - 1);
        if (end == '.' || end == '?' || end == '!') {
            int i;
            for (i = 0; i < s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i)))
                    break;
            }
            if (i == s.length())
                this.strdata = s;
        }
    }

    boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U')
            return true;
        else
            return false;
    }

    public void countWord() {
        boolean start = false, end = false;
        int starti = 0, endi = 0;
        int count = 0;
        if (strdata.equals("")) {
            System.out.println("count: 0");
            return;
        }
        for (int i = 0; i < strdata.length(); i++) {
            if (!start) {
                if (Character.isWhitespace(strdata.charAt(i))) {
                    continue;
                } else {
                    start = true;
                    starti = i;
                    // i--;
                }
            } else if (!end) {
                if (!Character.isWhitespace(strdata.charAt(i)) && i != strdata.length() - 1) {
                    continue;
                } else {
                    end = true;
                    endi = i-1;
                    i--;
                }
            } else {
                if (isVowel(strdata.charAt(starti)) && isVowel(strdata.charAt(endi))) {
                    count++;
                }
                System.out.println(strdata.substring(starti, endi+1)+" "+strdata.charAt(starti)+" "+strdata.charAt(endi) );
                start = false;
                end = false;
            }
        }
        System.out.println("no of words: " + count);
    }
    
    public void placeWord() {
        StringBuffer s = new StringBuffer(strdata);
        int offset = 0;
        String temp = "";
        boolean start = false, end = false;
        int starti = 0, endi = 0;
        if (strdata == "") {
            System.out.println("");
            return;
        }
        for (int i = 0; i < strdata.length(); i++) {
            if (!start) {
                if (Character.isWhitespace(strdata.charAt(i))) {
                    continue;
                } else {
                    start = true;
                    starti = i;
                    // i--;
                }
            } else if (!end) {
                if (!Character.isWhitespace(strdata.charAt(i)) && i != strdata.length() - 1) {
                    continue;
                } else {
                    end = true;
                    endi = i-1;
                    i--;
                }
            } else {
                if (isVowel(strdata.charAt(starti)) && isVowel(strdata.charAt(endi))) {
                    temp = temp + strdata.substring(starti, endi+1) + " ";
                    s.delete(starti-offset, endi-offset + 1);
                    offset += endi - starti + 1;
                }
                System.out.println(strdata.substring(starti, endi+1)+" "+strdata.charAt(starti)+" "+strdata.charAt(endi) + " temp:: " + temp + " s:: " + s);
                start = false;
                end = false;
            }
        }
        temp += s + " ";
        System.out.println(temp);
    }

    public static void main(String[] args) {
        WordExample w = new WordExample("   EA HELLO   EI   EEEI AEIOU FGFG?");
        w.countWord();
        w.placeWord();
    }
}
