import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MouseMotion" width="450" height="350"></applet>*/

public class MouseMotion extends Applet implements MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = mouseX + "," + mouseY;
        showStatus("Dragging mouse at" + mouseX + "," + mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        showStatus("Moving mouse at " + me.getX() + "," + me.getY());
        mouseX = me.getX();
        mouseY = me.getY();
        msg = mouseX + "," + mouseY;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
