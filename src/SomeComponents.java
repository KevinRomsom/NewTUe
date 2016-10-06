/**
 * Created by s158964 on 6-10-2016.
 */
import java.awt.*;
import javax.swing.*;
public class SomeComponents {

    JFrame frame = new JFrame ("Some Components");

    JLabel label = new JLabel( "What's \n my \n color?");

    JButton button = new JButton("Not OK");      // creates component: JButton

    JButton button2 = new JButton("OK");

    JTextField textfield = new JTextField("GREEN IS NOT A CREATIVE COLOR!");
    JPanel panel = new JPanel();                 // creates another component


    void buildIt() {
        frame.add(panel);                        // places panel in center of frame

        label.setBackground( Color.PINK );
        label.setOpaque( true );

        panel.setBackground(Color.GREEN);
        textfield.setBackground(Color.GREEN);
        panel.add(textfield, BorderLayout.NORTH);

        frame.add(button2, BorderLayout.SOUTH);   // places button at bottom of frame

        Color color = new Color(255, 255, 0);    // makes helper object: color yellow
        panel.setBackground(color);              // colors background panel

        frame.add(button, BorderLayout.WEST);


        frame.add( label, BorderLayout.NORTH);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // closing window exits program
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new SomeComponents().buildIt();
    }
}
