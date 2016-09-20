/**
 * Created by s158964 on 20-9-2016.
 */
import java.util.*;
public class EchoPit {
        Scanner scanner = new Scanner( System.in );
        ArrayList<String> words; // the numbers from input to be echoed
        String n; // last read number from input

        void echo() {
            words = new ArrayList<>();
            n = scanner.next();
            while (!(n.equals( "END"))){
                words.add( n );
                n = scanner.next();
            }
            for (int i= words.size()-1;i>=0; i--) {
                System.out.println( words.get( i ) );
            }
        }
        public static void main(String[] args){
            new EchoPit().echo();
        }
    }


