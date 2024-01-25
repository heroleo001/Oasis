public class GameLooper {
    public GameLooper(Display display){
        display.addKeyListener(new KeyListener(display));
    }
}
