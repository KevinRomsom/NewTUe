/**
 * Created by s158964 on 13-9-2016.
 */
import java.util.Scanner;

public class Maximize {
    Scanner sc = new Scanner(System.in);
    void toTheMax(){
        int number1;
        int number2;
        int number3;
        System.out.println("What is the first number?");
        number1 = sc.nextInt();
        System.out.println("What is the second number?");
        number2 = sc.nextInt();
        System.out.println("What is the third number?");
        number3 = sc.nextInt();

        if ((number1 > number2)&&(number1 > number3)){
            System.out.println(number1 + " is the max");
        }
        else if((number2 > number1)&& (number2 > number3)){
            System.out.println(number2 + " is the max");
        }
        else {
            System.out.println(number3 + " is the max");
        }
    }
    public static void main(String[]args){
        new Maximize().toTheMax();
    }

}
