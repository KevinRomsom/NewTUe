/**
 * Created by s158964 on 22-9-2016.
 */
import java.util.*;
public class FunWithFunctions {

    double f(double x){
        return (x*x - 2*x - 3);
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
        while(!(x <= 0.001 && x >= -0.001)) {
            System.out.println("what is your x?");
            x = sc.nextDouble();
            System.out.println("Your f(x) = "  + f(x));
            tries += 1;
        }
        System.out.println("Good job, sexy. You only needed " +
                tries + " tries");
    }

    public static void main(String[] args){
       // new FunWithFunctions().table();
        new FunWithFunctions().findingZero();
    }


}
