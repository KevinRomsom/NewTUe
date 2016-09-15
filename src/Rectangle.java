/**
 * Created by s158964 on 8-9-2016.
 */
import java.util.Scanner;
public class Rectangle {

    Scanner sc = new Scanner(System.in);

    void calcRectangle() {
        int x1, y1, x2, y2, x3, y3;

        System.out.println("Please, fill in three coördinates in the order of x1 y1, etc.");

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        if ((x2 < x1) || (y2 > y1)){
            System.out.println("ERROR");
        }
        else if((x2 > x3) && (y2 < y3)){
            System.out.println("Inside");
        }
        else {
            System.out.println("Outside");
        }
    }
    public static void main(String[]args){
        new Rectangle().calcRectangle();
    }
}
