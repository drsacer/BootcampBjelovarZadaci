package DodatniZadaciChatBot;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        System.out.println("KALKULATOR");

        char odabir = 'm';
        int rez = 0 ;

      //  do {
            System.out.println("Unesite prvi broj");
            int b1 = s.nextInt();
            System.out.println("Unesite drugi broj");
            int b2 = s.nextInt();

            System.out.println("Unesite željenu operaciju (*, -, /, +)");
            char operacija = s.next().charAt(0);

            if (operacija == '*') {
                rez = b1 * b2;
                System.out.println("Rezultat:" + rez);
            } else if (operacija == '/') {
                double rez1 = (double) b1 / b2;
                System.out.println("Rezultat:" + rez1);
            } else if (operacija == '-') {
                rez = b1 - b2;
                System.out.println("Rezultat:" + rez);
            } else if (operacija == '+') {
                rez = b1 + b2;
                System.out.println("Rezultat:" + rez);
            }
           // System.out.println("Želite li još računati ? d/n");
          //  odabir = s.next().charAt(0);

       // } while ( odabir != 'n' );
    }
}
