/**
 * Created by s158964 on 15-9-2016.
 */
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    /**
     * @param n the given char Array.
     * @return a String visualisation of the Char array.
     */
    public static String toString(char[] n){
        String result = "";
        for (int i = 0; i < n.length; i++){
            result += n[i];
        }
        return result;
    }

    public void theGame(){
        int code = rand.nextInt(100);
        int theguess;
        int guesses = 0;
        int stopper = 0;

        char[] guessArray = new char[100];
        for (int i = 0; i < guessArray.length; i++){
            guessArray[i] = '.';
            guessArray[code] = '|';
        }
        String finalString = "";
        while(stopper <= 7){
            System.out.println("Guess a number between 0 and 99");
            theguess = sc.nextInt();

            char[] guessArray2 = new char[100];
            for (int i = 0; i < guessArray2.length; i++){
                guessArray2[i] = guessArray[i];
            }
            guessArray2[theguess] = 'X';

            finalString += toString(guessArray2) + "\n";


            if (theguess > code){
                System.out.println("lower");
            }
            else if(theguess < code){
                System.out.println("higher");
            }
            else{
                System.out.println("Good guess! You won.");
                stopper = 8;
            }
            guesses += 1;
            stopper += 1;
        }
        if(guesses > 7){
            System.out.println("No more guesses, you lost.");
            System.out.println(finalString);
        }
        else {
            System.out.println(guesses + " guesses");
            System.out.println(finalString);
        }
    }
    public static void main(String[]args){
        new GuessingGame().theGame();
    }
}
