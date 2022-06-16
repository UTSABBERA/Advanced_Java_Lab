import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MouseLocation" width="450" height="350"></applet>*/

public class MouseLocation extends Applet implements MouseListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Mouse clicked at " + me.getX() + ", " + me.getY());
        msg = "Mouse clicked.";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Mouse pressed at " + me.getX() + ", " + me.getY());
        msg = "Button Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Mouse released at " + me.getX() + ", " + me.getY());
        msg = "Button Released";
        repaint();
    }

	public void mouseEntered(MouseEvent me) {
		showStatus("Mouse Entered At " + me.getX() + ", " + me.getY());
		msg = "Mouse Entered.";
		repaint();
	}

	public void mouseExited(MouseEvent me) {
		showStatus("Mouse Exited At " + me.getX() + ", " + me.getY());
		msg = "Mouse Exited.";
		repaint();
	}

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
