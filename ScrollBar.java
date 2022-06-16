
//assignment_7
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="ScrollBar" width="450" height="350"></applet>*/

public class ScrollBar extends Applet implements AdjustmentListener {
    String msg = "";
    Scrollbar scrollbar;
    int size;
    Font f;
    
    public void start() {
        size = 200;
        msg = "Change The Scrollbar";
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 10, 10, 10, size);
        add(scrollbar);
        scrollbar.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        f = new Font("Dialog", Font.PLAIN, scrollbar.getValue());
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(f);
        g.drawString(msg, 6, 160);

    }
}