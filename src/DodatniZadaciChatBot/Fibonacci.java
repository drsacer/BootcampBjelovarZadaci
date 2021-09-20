package DodatniZadaciChatBot;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        print();
        calculateFibonaci();

        int num = s.nextInt();
        System.out.println("Fibonacijev niz broja" + num + "iznosi:" + calculateFibonaci(num));
    }

    public static void print() {
        System.out.println("Računamo Fibonaccijev niz");
    }
    public static void calculateFibonaci(){
        int num = 10, niz = 1;
        for (int i = 1; i <= num; i++) {
            niz *= i;
        }
        System.out.println("Fibonacijev niz broja 10 iznosi:" + niz);
    }

    public static int calculateFibonaci(int num){
        int niz = 1;
        for (int i = 1; i <= num; i++) {
            niz *= i;
        }
        return niz;
    }
}
