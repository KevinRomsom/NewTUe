/**
 * Created by s158964 on 6-9-2016.
 */
import java.util.Scanner;

class Interest {
    Scanner sc = new Scanner(System.in);
    double saldo;
    double rate;  // percentage

    public void calcInterest() {
        System.out.println("What is your current saldo?");
        saldo = sc.nextDouble();
        System.out.println("Give interest rate as percentage ");
        rate = sc.nextDouble();
        double interest = (saldo*rate/100.0);
        System.out.println("After a year you get as interest: " +
                ( interest + " euro" ));
        saldo += interest;
        System.out.println("Your new saldo is: " + saldo + " euro");

    }

    public static void main(String[] args) {

        ( new Interest() ).calcInterest();
    }
}
