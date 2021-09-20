package ScanningInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanningInput {
    public static void main(String[] args) {
        // put your code here
        String names [] = new String [8] ;
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < 8; i++) {
            String in = scanner.next();
            names[i] = in;
            //System.out.println(in);
        }
        for (int i = names.length-1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        // drugo rješenje
        /*
        String name1 = scanner.next(); //Jane
        String name2 = scanner.next(); //Kate
        String name3 = scanner.next(); //John
        String name4 = scanner.next(); //Mary
        String name5 = scanner.next(); //Susan
        String name6 = scanner.next(); //Paul
        String name7 = scanner.next(); //Boris
        String name8 = scanner.next(); //Ann

        System.out.println(name8);
        System.out.println(name7);
        System.out.println(name6);
        System.out.println(name5);
        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);
         */

        // treće rješenje
        /*
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        while (scanner.hasNext()) {
            String name = scanner.next();
            names.add(name);
        }

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        */
    }
}
