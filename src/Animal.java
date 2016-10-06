/**
 * Created by s158964 on 6-10-2016.
 */
public class Animal {
    String name;
    int stomach; // number of meals
    Trough trough;

    Trough getTrough() {
        return trough;
    }
    void setTrough(Trough t){
        trough = t;
    }
    void eat() {
        int meal = trough.give();
        stomach = stomach + meal;
    }
}


