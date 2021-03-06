//Mathew Beseris

//Experiment for drawing pixels onto a small display

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.List;
import javax.swing.*;

public class DrawTest extends JPanel
{
    public DrawTest()
    {
        int size = 300;
        BufferedImage bi = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        ImageIcon icon = new ImageIcon( bi );
        add( new JLabel(icon) );

        for (int y = 0; y < size; y += 5)
        {
            for (int x = 0; x < size; x++)
            {
                Color color = (y % 2 == 0) ? Color.BLUE : Color.RED;
                int colorValue = color.getRGB();
                bi.setRGB(x, y, colorValue);
                bi.setRGB(x, y + 1, colorValue);
                bi.setRGB(x, y + 2, colorValue);
                bi.setRGB(x, y + 3, colorValue);
                bi.setRGB(x, y + 4, colorValue);
                bi.setRGB(25, 25, Color.BLACK.getRGB());
                bi.setRGB(26, 25, Color.BLACK.getRGB());
                bi.setRGB(27, 25, Color.BLACK.getRGB());
                bi.setRGB(27, 26, Color.BLACK.getRGB());
            }
        }
    }

    private static void createAndShowGUI()
    {
        JFrame frame = new JFrame("SSCCE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new SSCCE() );
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}
