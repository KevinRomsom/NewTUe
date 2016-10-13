// MouseDemo - show some mouse interaction

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseDemoOld extends JPanel implements MouseListener {
    int x, y; // location of mouse
    int sx=10, sy=10; // size of shape
    JFrame frame;

    void buildIt() {
        frame = new JFrame("MouseDemo");
        frame.add( this );
        this.x = 150;
        this.y = 150;
        this.addMouseListener(this); // MouseDemo is its own MouseListener!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor( Color.blue );
        g.fillRect(x - sx/2, y - sy/2, sx, sy);
    }

    // the method from MouseListener we're interested in this time
    public void mousePressed( MouseEvent e) {
        // add code to update x and y
        int x = MouseInfo.getPointerInfo().getLocation().x;
        int y = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(x+ "kanker" + y);

    }

    // the other four methods from MouseListener
    // we don't use them, but they have to appear here
    public void mouseReleased( MouseEvent e) { }
    public void mouseClicked( MouseEvent e) { }
    public void mouseEntered( MouseEvent e) { }
    public void mouseExited( MouseEvent e) { }

    public static void main(String[] args) {
        new MouseDemoOld().buildIt();
    }
}