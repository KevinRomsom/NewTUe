/**
 * Created by s158964 on 1-10-2016.
 */
public class Sudoku {
    private static final int SIZE = 9;     // size of the grid e.g. 9 -> 9x9
    private static final int DMAX = 9;     // max digit to be filled in e.g. 9
    private static final int BOXSIZE = 3;  // size of the boxes e.g. 3 -> 3x3
    int[][] grid = new int[][] {
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
    void run() {
        //TODO starts the solving process.
        print();
        solve();
        print();


        //END TODO
        }

    boolean givesConflict(int r, int  c, int d) {
        //TODO is there a conflict when we fill in d at position r,c?



        //END TODO
        return false;
    }

    boolean rowConflict(int r, int d) {
        //TODO is there a conflict in row r when we fill in d?



        //END TODO
        return false;
    }

    boolean colConflict(int c, int d) {
        //TODO is there a conflict in column c when we fill in d?



        //END TODO
        return false;
    }

    boolean boxConflict(int rr, int cc, int d) {
        //TODO is there a conflict when we fill in d at position in the box of rr,cc?



        //END TODO
        return false;
    }


    int[] findEmptySquare() {
        //TODO return the next empty square (See assignment).



        //END TODO
        return null;
    }

    void solve() {
        //TODO see (4)



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
            if (countj == 2 || countj == 5){
                System.out.print("-----------------------\n");
            }
            countj++;
            System.out.println("|");
        }countj = 0;

        //END TODO
    }

    //TODO extra methods



    //END TODO


    public static void main(String[] args) {
        new Sudoku().run();
    }
}

