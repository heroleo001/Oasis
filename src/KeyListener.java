import components.TiltablePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

    private final Display display;

    public KeyListener(Display display){
        this.display = display;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W){
            for (Component component : display.getComponents()){
                if (component instanceof TiltablePanel tiltableComponent){
                    tiltableComponent.tilt(0, 50);
                    System.out.println("tilting");
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
