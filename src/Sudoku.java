/**
 * Created by s158964 on 1-10-2016.
 */
import java.util.ArrayList;

public class Sudoku {
    private static final int SIZE = 9;     // size of the grid e.g. 9 -> 9x9
    private static final int DMAX = 9;     // max digit to be filled in e.g. 9
    private static final int BOXSIZE = 3;  // size of the boxes e.g. 3 -> 3x3
    int[][] initialgrid = new int[][] {
            { 0, 6, 0,  0, 0, 1,  0, 9, 4 },
            { 3, 0, 0,  0, 0, 7,  1, 0, 0 },
            { 0, 0, 0,  0, 9, 0,  0, 0, 0 },
            { 7, 0, 6,  5, 0, 0,  2, 0, 9 },
            { 0, 3, 0,  0, 2, 0,  0, 6, 0 },
            { 9, 0, 2,  0, 0, 6,  3, 0, 1 },
            { 0, 0, 0,  0, 5, 0,  0, 0, 0 },
            { 0, 0, 7,  3, 0, 0,  0, 0, 2 },
            { 4, 1, 0,  7, 0, 0,  0, 8, 0 },
    };

    int solutionnr = 0; //solution counter
    ArrayList restoreemptyness = new ArrayList();
    int[] firstone = new int[3];
    int[][] grid = initialgrid;
    void run() {
        //TODO starts the solving process.
        print();
        solve();
        print();


        //END TODO
        }

    boolean givesConflict(int r, int  c, int n) {
        //TODO is there a conflict when we fill in d at position r,c?
        if(rowConflict(r, n) || colConflict(c, n) || boxConflict(r, c, n)){
            return true;
        }

        //END TODO
        return false;
    }

    boolean rowConflict(int r, int n) {
        //TODO is there a conflict in row r when we fill in d?
        for (int i = 0; i < grid.length; i++){
            if (grid[r][i] == n){
                return true;
            }
        }


        //END TODO
        return false;
    }

    boolean colConflict(int c, int n) {
        //TODO is there a conflict in column c when we fill in d?
        for (int i = 0; i < grid.length; i++){
            if(grid[i][c] == n){
                return true;
            }
        }


        //END TODO
        return false;
    }

    boolean boxConflict(int rr, int cc, int n) {
        //TODO is there a conflict when we fill in d at position in the box of rr,cc?
        int[] array = locateBox(rr, cc);
        for(int i = array[0]; i <= array[1]-array[0]; i++){
            for(int j = array[2]; j <= array[3]-array[2]; j++){
                if(grid[i][j] == n){
                    return true;
                }
            }
        }

        //END TODO
        return false;
    }


    int[] findEmptySquare() {
        //TODO return the next empty square (See assignment).
        int rempty = 0;
        int cempty = 0;
        int[] emptyloc = new int[2];
        for(int i = cempty; i < grid.length; i++){
            for(int j = rempty; j < grid.length; j++){
                if(grid[j][i] == 0){
                    rempty = j;
                    cempty = i;
                    emptyloc[0] = j;
                    emptyloc[1] = i;
                    return emptyloc;
                }
            }
        }

        //END TODO
        return null;
    }

    void solve() {
        //TODO see (4)
        int[] coordinates = findEmptySquare();
        restoreemptyness.add(coordinates[0]);
        restoreemptyness.add(coordinates[1]);
        for(int i = 1; i <= SIZE; i++){
            if(!(givesConflict(coordinates[0], coordinates[1], i))) {
                grid[coordinates[0]][coordinates[1]] = i;
                solutionnr++;
            }
            firstone[restoreemptyness[0], restoreemptyness[1], i]
        }
        grid = initialgrid;



        //END TODO
    }

    // print the grid, 0s are printed as spaces
    void print() {
        //TODO print the grid, printing spaces instead of 0s.
        int counti = 0;
        int countj = 0;
        System.out.print("+--------------------+\n");
        for(int j = 0; j <grid.length; j++){
            for (int i = 0; i < grid.length; i++) {
                if (grid[j][i]==0) {
                    System.out.print("  ");
                    if(counti == 2 || counti == 5){
                        System.out.print("|");
                    }
                }
                else{
                    System.out.print(grid[j][i]+ " ");
                    if(counti == 2 || counti == 5) {
                        System.out.print("|");
                    }
                }
                counti++;
            } counti = 0;
            System.out.println("|");
            if (countj == 2 || countj == 5){
                System.out.println("-----------------------");
            }
            countj++;

        }countj = 0;

        //END TODO
    }

    //TODO extra methods
    void int[] locateBox(int r, int c){
        int[] location = new int [4];
        if (0 <= r && r <= 2 && 0 <= c && c <= 2){
            location[0] = 0;
            location[1] = 2;
            location[2] = 0;
            location[3] = 2;
            return location;
        }
        if (3 <= r && r <= 5 && 0 <= c && c <= 2){
            location[0] = 3;
            location[1] = 5;
            location[2] = 0;
            location[3] = 2;
            return location;
        }
        if (6 <= r && r <= 8 && 0 <= c && c <= 2){
            location[0] = 6;
            location[1] = 8;
            location[2] = 0;
            location[3] = 2;
            return location;
        }
        if (0 <= r && r <= 2 && 3 <= c && c <= 5){
            location[0] = 0;
            location[1] = 2;
            location[2] = 3;
            location[3] = 5;
            return location;
        }
        if (3 <= r && r <= 5 && 3 <= c && c <= 5){
            location[0] = 3;
            location[1] = 5;
            location[2] = 3;
            location[3] = 5;
            return location;
        }
        if (6 <= r && r <= 8 && 3 <= c && c <= 5){
            location[0] = 6;
            location[1] = 8;
            location[2] = 3;
            location[3] = 5;
            return location;
        }
        if (0 <= r && r <= 2 && 6 <= c && c <= 8){
            location[0] = 0;
            location[1] = 2;
            location[2] = 6;
            location[3] = 8;
            return location;
        }
        if (3 <= r && r <= 5 && 6 <= c && c <= 8){
            location[0] = 3;
            location[1] = 5;
            location[2] = 6;
            location[3] = 8;
            return location;
        }
        if (6 <= r && r <= 8 && 6 <= c && c <= 8){
            location[0] = 6;
            location[1] = 8;
            location[2] = 6;
            location[3] = 8;
            return location;
        }
    }


    //END TODO


    public static void main(String[] args) {
        new Sudoku().run();
    }
}

