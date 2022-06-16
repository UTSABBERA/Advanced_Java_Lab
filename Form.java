//A program to design a form using components textbox, text field, checkbox, buttons, and list. 
import java.applet.*;
import java.awt.*;

/*<applet code="Form" width="450" height="350"></applet>*/

public class Form extends Applet {
    public void start() {
        TextField textField = new TextField("Name of the program");
        textField.setColumns(47);

        TextArea area = new TextArea("//code goes here");
        area.setPreferredSize(new Dimension(400, 150));

        List list = new List(3); //list

        list.add("C");    
        list.add("C++");    
        list.add("Java");  

        Checkbox checkbox = new Checkbox("This code dosen't contains any error");    
        checkbox.setPreferredSize(new Dimension(400, 20)); 

        Button button = new Button("Submit");
        button.setPreferredSize(new Dimension(400, 30)); 
  
        add(textField);
        add(area);
        add(list);
        add(checkbox);
        add(button);
     }   
}  