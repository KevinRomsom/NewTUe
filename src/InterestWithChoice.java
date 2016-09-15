/**
 * Created by s158964 on 8-9-2016.
 */
import java.util.Scanner;

public class InterestWithChoice {
    Scanner sc = new Scanner(System.in);

    public void calcBalance(){
        double balance;
        System.out.println("What is your current balance?");
        balance = sc.nextDouble();
        if((balance > 0) && (balance < 10000)){
            balance = balance*1.025;
            System.out.println("your balance is: " + balance);
        }
        else if(balance >= 10000){
            balance = balance*1.03;
            System.out.println("Your balance is: " + balance);
        }
        else {
            balance = balance*1.005;
            System.out.println("your balance is: " + balance);
        }

    }
    public static void main(String[]args){
        new InterestWithChoice().calcBalance();
    }
}
