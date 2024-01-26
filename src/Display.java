import components.TiltablePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Display extends JFrame {

    private final List<JPanel> panelList = new ArrayList<>();
    public Display(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setExtendedState(MAXIMIZED_BOTH);
        setSize(800, 800);
        setLayout(null);
    }

    public void drawPanel(int x,
                          int y,
                          int width,
                          int height,
                          int horizontalTilt,  // Degrees
                          int verticalTilt,
                          Color color){

        TiltablePanel panel = new TiltablePanel();
        panel.setBackground(color);
        panel.setBounds(x, y, width, height, horizontalTilt, verticalTilt);
        add(panel);
        System.out.println(getComponents().length);

    }

    public List<JPanel> getPanelList() {
        return panelList;
    }

    @Override
    public Component add(Component comp) {
        if (comp instanceof JPanel panel){
            panelList.add(panel);
        }
        return super.add(comp);
    }
}
