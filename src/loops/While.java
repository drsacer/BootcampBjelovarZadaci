package loops;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        while (sum < 100){
            num = sc.nextInt();
            sum+= num;
            System.out.println("sum:" + sum);
        }
        System.out.println(sum);
    }
}
