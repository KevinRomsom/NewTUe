/**
 * Created by s158964 on 22-9-2016.
 */
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

    public static void main(String[] args){
        new FunWithFunctions().table();
    }


}
