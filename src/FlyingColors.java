/**
 * Created by s158964 on 6-10-2016.
 */
import java.awt.*;
import javax.swing.*;
public class FlyingColors {
    JFrame frame;
    JLabel toplabel;

    void buildGUI() {
        frame = new JFrame( "Flying Colors" );
        toplabel = new JLabel( "What's my background color?" );
        toplabel.setOpaque(true);
        toplabel.setBackground(Color.PINK);

        frame.add(toplabel, BorderLayout.NORTH);

        frame.setSize(500, 300);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        (new FlyingColors()).buildGUI();
    }
}
