package loops;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while (num > 0 &&  num < 100 );
    }
}
