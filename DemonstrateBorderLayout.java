//A program to demonstrate use of Border Layout 
import java.awt.*;
import java.applet.*;

/*<applet code="DemonstrateBorderLayout" width="450" height="350"></applet>*/

public class DemonstrateBorderLayout extends Applet {
    public void init(){
        setLayout(new BorderLayout());
        
        add("North", new Button("TOP "));
        add("South", new Button("BOTTOM"));
        add("East", new Button("RIGHT"));
        add("West", new Button("LEFT"));
        add("Center", new Button("MIDDLE"));
	}
}