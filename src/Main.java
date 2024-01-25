import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Display disp = new Display();
        new GameLooper(disp);
    }
}