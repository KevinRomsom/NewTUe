/**
 * Created by s158964 on 20-9-2016.
 */
public class MaxIntValue {

    void maxInt(){
        int number = 0;
        int number2 = 0;

        while(number >= 0){
            number += 1;
            number2 = number -1;
        }

        System.out.println(number2);
    }

    public static void main(String[]args) {
        new MaxIntValue().maxInt();
    }
}
