//A program to design a form using components textbox, text field, checkbox, buttons, and list.
import java.awt.*;

public class Menubar extends Frame {
    public void start() {
        Frame f = new Frame("MenuBar with menu and submenu");
        MenuBar menubar = new MenuBar();
        Menu menu = new Menu("Programming Languages");
        MenuItem item1 = new MenuItem("C");
        MenuItem item2 = new MenuItem("C++");

        Menu submenu = new Menu("Java");
        MenuItem subitem1 = new MenuItem("Core Java");
        MenuItem subitem2 = new MenuItem("Advance Java");

        menu.add(item1);
        menu.add(item2);
        submenu.add(subitem1);
        submenu.add(subitem2);
        menu.add(submenu);
        menubar.add(menu);

        f.setMenuBar(menubar);
        f.setSize(500, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Menubar().start();
    }
}