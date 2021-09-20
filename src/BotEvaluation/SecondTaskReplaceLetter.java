package BotEvaluation;
import java.util.Scanner;

public class SecondTaskReplaceLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String w = s.next();
        String ab = w.replace('a','b');
        System.out.println(ab);

        /*
        for (int i = 0; i < w.length(); i++) {
            System.out.println(w.charAt(i));
            if (w.charAt(i)=='a'){
              //  w.charAt(i)='b'; ovo ne ide jer se String ne može izmijeniti (mislim) - potrebno je stvoriti novi string
              // kao u primjeru gore - String ab i onda u njega upisujemo izmjenu slova a sa slovom b
              // objašnjeno : http://java.zemris.fer.hr/nastava/opjj/book-2015-09-30.pdf - str 33, 34
            }
        }*/

        //drugi način
        String str = w;
        char ch = '_';
        int pos = 6;

        // convert the given string to a character array
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='a'){
                chars[i] = 'b';
            }
        }

        // convert the character array back into a string
        str = String.valueOf(chars);

        // print the modified string
        System.out.println(str);
    }
}
