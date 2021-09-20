package DodatniZadaciChatBot;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String rijec = s.nextLine();
        String pal = "";

        for (int i = rijec.length()-1; i >=0; i--) {
            pal += rijec.charAt(i);
        }
        if (rijec.equals(pal)) {
            System.out.println("Rijec " + rijec + " je palindrom");
        } else {
            System.out.println("Nije palindrom");
        }
    }
}
