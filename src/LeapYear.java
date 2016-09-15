/**
 * Created by s158964 on 8-9-2016.
 */
import java.util.Scanner;

public class LeapYear {
    Scanner sc = new Scanner(System.in);

    public void calcLeapYear(){
        int year;
        System.out.println("What year is it?");
        year = sc.nextInt();
        if ((year%4 == 0)&& !(year%100 == 0)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[]args){
        new LeapYear().calcLeapYear();
    }
}
