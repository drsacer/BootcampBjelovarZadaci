package DodatniZadaciChatBot;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        int slucajniBroj = (int) (Math.random() * 100);
        //System.out.println ("Broj :" + slucajniBroj);
       /* Random r = new Random();
        int slucajniBroj = (int)Math.random()*(30-10+1)+10;  slučajni broj u rasponu od 10 do 30*/

        int broj = 0;
        int brojac = 1;

        do {
            Scanner c = new Scanner(System.in);
            System.out.println("Unesite broj:");
            broj = c.nextInt();

            if (broj < slucajniBroj){
                System.out.println ("Broj je premali");
                brojac = brojac + 1;
            }
            else if (broj > slucajniBroj){
                System.out.println ("Broj je prevelik");
                brojac = brojac + 1;
            }
            else System.out.println ("pogodak, trazeni broj je " + slucajniBroj + ", pogodili ste iz " + brojac + " pokusaja");
        } while (broj != slucajniBroj); }

}
