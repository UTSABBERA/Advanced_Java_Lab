//A program to design a calculator using Java components and handle various events related to each component (Applet)
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Calculator" width="300" height="120"></applet>*/

public class Calculator extends Applet implements ActionListener {
	TextField num1, num2, res;
	Button add, sub, mult, div;
	public void start() {	
		num1 = new TextField(30);
		num2 = new TextField(30);
		res = new TextField(30);
		add = new Button(" + ");
        sub = new Button(" - ");
		mult = new Button(" * ");
		div = new Button(" / ");
		
		add(num1); add(num2); add(add); 
		add(sub); add(mult); add(div); 
		add(res);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
	}
	public void actionPerformed(ActionEvent E) {
        double x = Double.parseDouble(num1.getText());
		double y = Double.parseDouble(num2.getText());
        String ans = "Error";

		if (E.getSource() == add) ans = (x + y)+"";
		if (E.getSource() == sub) ans = (x - y)+"";
		if (E.getSource() == mult) ans = (x * y)+"";
		if (E.getSource() == div) ans = (x / y)+"";
        
        res.setText(ans);
	}
}