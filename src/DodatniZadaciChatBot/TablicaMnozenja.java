package DodatniZadaciChatBot;

import java.util.Scanner;

public class TablicaMnozenja {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Prvi broj:");
        int broj = s.nextInt();
        System.out.println("Drugi broj:");
        int broj1 = s.nextInt();

        String ss = "----";

        System.out.print ( "  |" );
        for (int i = broj; i <= broj1 ; i++){
            System.out.print ( "  " + i );
        }
        System.out.println();

        for (int i = broj; i <= broj1 ; i++){
            System.out.print (ss);
        }
        System.out.println();

        for (int i = broj; i <= broj1 ; i++){
            System.out.print (i + "| ");
            for (int x = broj ; x <= broj1 ; x++){
                if (i * x >9) {
                    System.out.print (" " + i * x);
                } else {
                    System.out.print("  " + i * x);
                }
            }
            System.out.println();
        }
    }
}
