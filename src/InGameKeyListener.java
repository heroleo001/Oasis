import components.TiltablePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class InGameKeyListener implements java.awt.event.KeyListener {

    private final Display display;

    public InGameKeyListener(Display display){
        this.display = display;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed event");
        if (e.getKeyCode() == KeyEvent.VK_W){
            System.out.println("W key pressed");
            for (Component component : display.getComponents()){
                System.out.println(component.getClass().getName());
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
