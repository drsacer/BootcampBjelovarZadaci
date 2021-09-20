package ZadaciJetBrains;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int current = 0, counter = 0;

        do {
            current = current + a;
            if (current >= h) {
                break;
            }
            else {
                current -= b;
            }
            counter += 1;

        } while (current <= h) ;

        System.out.println(counter + 1);
    }
}
