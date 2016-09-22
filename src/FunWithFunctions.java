/**
 * Created by s158964 on 22-9-2016.
 */
import java.util.*;
public class FunWithFunctions {
    double a;
    double b;
    double c;

    void defineVariables(){
        System.out.println("What are your a, b and c?");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

    }

    double f(double x){
        return (a*x*x - b*x - c);
    }

    void table(){
        System.out.println("  x"+"\t"+"f(x)");
        System.out.println("_______________");
        double q = -3;
        while(q <= 3){
            System.out.println(q +" \t"+ f(q));
            q += 0.5;

        }
    }
    Scanner sc = new Scanner(System.in);
    double x;
    int tries = 0;
    void findingZero(){
        while(!(f(x) <= 0.001 && f(x) >= -0.001)) {
            System.out.println("what is your x?");
            x = sc.nextDouble();
            System.out.println("Your f(x) = "  + f(x));
            tries += 1;
            System.out.println("Try again");
        }
        System.out.println("Good job, sexy. You only needed " +
                tries + " tries");
    }

    public static void main(String[] args){
        new FunWithFunctions().defineVariables();
        new FunWithFunctions().table();
        new FunWithFunctions().findingZero();
    }


}
