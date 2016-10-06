import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Letter extends JFrame {
    static int sn = 0; // last used serial number

    String text = " ";  //default text of Letter
    int fontSize = 120; //default fontsize of text in pixel height
    int step = 10;

    LetterPanel panel;

    /**** Constructors ***/

    // creates a blank Letter
    public Letter() {
        this(" ");
    }

    //creates a Letter with text s
    //at the top left of the screen, with newer Letters shifted farther to the right
    public Letter(String s) {
        this.panel = new LetterPanel(this);
        this.add(this.panel);
        if (s!=null && s.length()>0) {
            text = s.substring(0,1);
        }
        this.setSize(200,200);
        this.setTitle("#"+sn++);
        this.setLocation(10*sn, 10);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //creates a Letter with text c
    public Letter(char c) {
        this(String.valueOf( c ));
    }

    //changes the text to t
    public void setText(String t) {
        if (t!=null) { text = t; }
        this.repaint();
    }

    //ditto
    public void setText(char c) {
        this.setText(String.valueOf( c ));
    }

    //changes (sets) the background color
    public void setColor(Color c) {
        this.panel.setBackground(c);
    }

    //changes (sets) the fontsize to a height of fs pixels
    public void setFontSize(int fs) {
        this.fontSize = fs;
        this.repaint();
    }

    //centers the Letter on the screen
    public void center() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int a = screen.width;
        int b = this.getWidth();
        int x = (a-b)/2;
        //int x = (screen.getWidth() - this.getWidth())/2;
        int y = screen.height/2 - this.getHeight()/2;
        this.setLocation(x, y);
        this.toFront();
    }

    /* methods to move the Letter on the screen */

    // move dx pixels to the right and dy down; negative arguments move left resp. up
    public void moveRel(int dx, int dy) {
        Point here = this.getLocationOnScreen();
        this.setLocation(here.x + dx, here.y + dy);
        this.toFront();
    }

    // four methods that move step pixels to the right, left, down, up
    public void moveRight() {
        this.moveRel(step,0);
    }

    public void moveLeft() {
        this.moveRel(-step,0);
    }

    public void moveDown() {
        this.moveRel(0,step);
    }

    public void moveUp() {
        this.moveRel(0,-step);
    }

    // move Letter to an absolute position on the screen
    public void moveAbs(int x, int y) {
        this.setLocation(x,y);
    }

    public void moveRandom() {
        double r = Math.random();
        if (r < 0.25){
            this.moveRight();
        }
        else if (r < 0.5) {
            this.moveLeft();
        }
        else if (r < 0.75) {
            this.moveDown();
        }
        else {
            this.moveUp();
        }
    }

    //pausing is not needed for experiments from the Interactions
    // pane of DrJava
    //pause execution for ms milliseconds
    public static void pause(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    //pause execution for sec seconds
    public static void pause(double sec) {
        pause((long) (sec*1000));
    }

    // only for testing purposes
    public static void exampleUse() {
        Letter x = new Letter("X");
        x.pause(0.5);
        x.setColor(Color.pink);
        x.pause(1.0);
        x.setColor(Color.green);
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        Letter test1 = new Letter('F');
        Letter test2 = new Letter('U');
        Letter test3 = new Letter('N');
        test2.moveRel(173,0);
        test3.moveRel(346,0);
//        test1.setColor(Color.red);
//        test2.setColor(Color.white);
//        test3.setColor(Color.blue);
//        test2.moveRel(0,37);
//        test3.moveRel(0,74);

        Letter[] letterArray = new Letter[3];
        letterArray[0] = test1;
        letterArray[1] = test2;
        letterArray[2] = test3;

        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < letterArray.length; i++) {
                letterArray[i].moveRandom();
                pause(1.0);
            }
        }
    }
}


class LetterPanel extends JPanel {
    Letter letter;

    LetterPanel(Letter let) {
        this.letter = let;
    }

    //redraws the Letter, called by the windowing system
    //text is vertically more or less centered, horizontally it is not
    public void paint(Graphics g) {
        super.paintComponent(g);
        int bar = 10;           // height of title bar (Mac OS); estimation
        int h = getHeight() - bar;
        Font font = new Font(
                g.getFont().getFontName(), Font.BOLD, letter.fontSize
        );
        g.setFont(font);
        g.drawString(letter.text, 25, (h+letter.fontSize)/2 - 10);
    }

}