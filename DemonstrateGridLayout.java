//A program to demonstrate use of Grid Layout 
import java.awt.*;
import java.applet.*;

/*<applet code="DemonstrateGridLayout" width="450" height="350"></applet>*/

public class DemonstrateGridLayout extends Applet {
	public void init() {
	    setLayout(new GridLayout(3, 3));
        setFont(new Font("Montsarrat", Font.PLAIN,24));
        for (int i = 1; i <= 9; i++) {
            add(new Button(i+""));
        }
    }
}
