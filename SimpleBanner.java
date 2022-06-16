//A java program to create a simple banner using Applet
import java.applet.*;
import java.awt.*;

/*<applet code = "SimpleBanner" width=300 height=100></applet>*/

public class SimpleBanner extends Applet implements Runnable {
    String text = "Banner Title ";
    Thread t;
    //Initialize the applet
    public void init() {}
    //Function to start the thread
    public void start() {
        t = new Thread(this);
        t.start();
    }
    //Function to execute the thread
    public void run() {
        while(true) {
            try {
                repaint();
                Thread.sleep(1000); //Delay each thread by 1000ms or 1 seconds
                text = text.substring(1) + text.charAt(0);
            }
            catch(Exception e) {}
	    }
    }
    //Function to draw text
    public void paint(Graphics g) {
        g.setFont(new Font("Montserret", Font.BOLD, 25));
        g.drawString(text, 60,  60);
    }
}