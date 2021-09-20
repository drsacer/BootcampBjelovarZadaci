package arrays;

import java.util.Scanner;

public class Stanari {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        int[] numbers = {4,7,2,4};
        System.out.println(numbers[1]);
        int brojElemenata = numbers.length;
        System.out.println("Broj elemenata polja je :" + brojElemenata);

        System.out.println("Unesite broj stanara na jednom katu:");
        int brojStanara = s.nextInt();
        String[] stanari = new String[brojStanara];

        for(int i = 0; i < brojStanara; i++){
            System.out.println("Unesite ime stanara:");
            String ime = s.next();
            stanari[i] = ime;
        }

        System.out.println("Stanari:");
        for (int i = 0; i < stanari.length; i++) {
            System.out.print(stanari[i]+ " ");
        }

        System.out.println();
        System.out.println("Unesite ime stanara:");
        String imeStanara = s.next();

        for (int i = 0; i < stanari.length; i++) {
            if(imeStanara.equals(stanari[i])){
                System.out.println("Desni susjed:" + stanari[i+1]);
                System.out.println("Lijevi susjed:" + stanari[i-1]);
            }
        }
    }
}
