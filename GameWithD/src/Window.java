import javax.swing.*;
import java.awt.*;

/**
 * Created by Lukas on 10/08/2017.
 */
public class Window {
    public static void CreateWindow() {
        JFrame frame = new JFrame("FrameDemo");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
