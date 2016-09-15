/**
 * Created by s158964 on 6-9-2016.
 */

import java.util.Scanner;
public class Instruction1 {
    Scanner sc = new Scanner(System.in);
    int dateOfBirth;
    int currentDate;

    public void ageCalc(){
        System.out.println("Give your date of birth as yyyymmdd");
        dateOfBirth = sc.nextInt();
        System.out.println("Give the current date");
        currentDate = sc.nextInt();
        System.out.println("Your age is "+ (currentDate - dateOfBirth)/10000 +"years");

    }
    public static void main(String[] args){
        (new Instruction1()).ageCalc();
    }

}
