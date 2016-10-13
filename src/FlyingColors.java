/**
 * Created by s158964 on 6-10-2016.
 */
/** Flying Colors -- for exercise 11.3
 * @author Kees
 */
import java.awt.*;
import javax.swing.*;

public class FlyingColors {
    JFrame frame;
    JLabel toplabel;
    JPanel colorPanel;
    int numcols = 8;
    int numrows = 8;

    void buildColorPanel() {
        colorPanel = new JPanel();
        colorPanel.setLayout( new GridLayout(numrows, numcols) );
        int numcells = numrows*numcols;
        for (int i=0; i<numcells; i++) {
            JLabel label = new JLabel();
            label.setOpaque(true);
            int whiteness = i*256/numcells;
            label.setBackground( new Color(255, whiteness, whiteness) );
            colorPanel.add(label);
        }
        frame.add(colorPanel);
    }

    void buildGUI() {
        frame = new JFrame( "Flying Colors" );
        toplabel = new JLabel( "What's my background color?" );
        toplabel.setOpaque(true);
        toplabel.setBackground(Color.PINK);
        frame.add(toplabel, BorderLayout.NORTH);

        buildColorPanel();

        frame.setSize(500, 300);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        (new FlyingColors()).buildGUI();
    }
}

