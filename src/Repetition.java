/**
 * Created by s158964 on 13-9-2016.
 */
import java.util.Scanner;

public class Repetition {
    Scanner sc = new Scanner(System.in);
    void productNumbers(){
        System.out.println("Type your numbers, terminated by 0");
        int n = 1;
        int product = 1;

        while(n != 0){
            n = sc.nextInt();
            if (n != 0){
                product *= n;
            }
        }
        System.out.println("The product of all the numbers is "+ product);
    }
    public static void main(String[]args){
        new Repetition().productNumbers();
    }
}
