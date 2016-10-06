/**
 * Created by s158964 on 6-10-2016.
 */
public class Trough {
    int contents; // number of meals
    void fill(int m) {
        contents = contents + m;
    }
    int give() {
        if ( contents > 0 ) {
            contents--;
            return 1;
        } else {
            return 0;
        }
    }

}
