import java.awt.*;

public class GameLooper {
    public GameLooper(Display display){
        display.addKeyListener(new InGameKeyListener(display));

        display.drawPanel(100, 100, 100, 100, 0, 0, new Color(255));
        display.drawPanel(100, 200, 100, 100, 0, 0, new Color(0xF11D09));
        display.drawPanel(100, 300, 100, 100, 0, 0, new Color(0xFF13DA05));
    }
}
