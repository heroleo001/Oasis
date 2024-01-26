import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Display disp = new Display();
        //new GameLooper(disp);

        JFrame frame = new JFrame();
        JButton jb = new JButton();
        frame.add(jb);
        Arrays.stream(frame.getComponents()).forEach(System.out::println);
    }
}