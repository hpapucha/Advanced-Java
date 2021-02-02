import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel p = null;
    public MyFrame()
        {
            // Set caption in title bar to "Drawing Project"
            super("Drawing Project");

            // Create and add panel to frame.
            p = new MyPanel();
            p.setLayout(new FlowLayout());
            setContentPane(p);

            // Configure frame.
            setSize(400, 500);
            setVisible(true);
        }
    }
