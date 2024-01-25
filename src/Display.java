import components.TiltablePanel;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public Display(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
    }

    public void drawPanel(int x,
                          int y,
                          int width,
                          int height,
                          int horizontalTilt,  // Degrees
                          int verticalTilt,
                          Color color){   // Degrees

        TiltablePanel panel = new TiltablePanel();
        panel.setBackground(color);
        panel.setBounds(x, y, width, height, horizontalTilt, verticalTilt);
        add(panel);
    }
}
