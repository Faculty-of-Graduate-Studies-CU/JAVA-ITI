import java.applet.Applet;
import java.awt.Graphics;
public class HelloApplet extends Applet{
  public void paint (Graphics g){
    g.drawString("Hello,java",50,100);
 // the class must be public 
// or either the browser will not be able to access the class and create an object of it
  }
}
