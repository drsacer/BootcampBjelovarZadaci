package BotEvaluation;

import java.util.Scanner;

public class FirstTaskWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. način - komplicirano

       /* String words [] = new String[3];
        String s = "";
        for (int i = 0; i<3; i++){
            String w = sc.nextLine();
            s +=w+" ";
        }

        String[] space  = s.split(" ");
        for (int i = 0; i<space.length; i++){
            System.out.println(space[i]);
        }*/

        Scanner scanner = new Scanner (System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String name4 = scanner.next();

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
