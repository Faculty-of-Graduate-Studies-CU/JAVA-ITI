//Example Applet Code Structure:
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class BouncingBall extends Applet implements Runnable {
    private int x, y; // Ball position
    private int dx = 2, dy = 3; // Ball direction
    
    public void init() {
        setBackground(Color.black);
        x = 50;
        y = 50;
    }
    
    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
    
    public void run() {
        while (true) {
            moveBall();
            repaint();
            try { Thread.sleep(20); } 
            catch (InterruptedException e) {}
        }
    }
    
    private void moveBall() {
        // Ball movement logic would go here
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, 30, 30);
    }
}
