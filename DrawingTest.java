import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawingTest extends Canvas

{
    public static void main (String Arg[])

    {
        System.out.println("DrawingTest starts");

        JFrame frame = new JFrame("DrawingTest");

        Canvas canvas = new DrawingTest();

        String command = "C";

        if (command == "C")

        {

            int cW = 200;

            int cH = 200;

            canvas.setSize(cW, cH);

            frame.add(canvas);

            frame.pack();

            frame.setVisible(true);

        }

        else

        {
            System.out.println("Fail");
        }
    }

    public void paint(Graphics g)

    {
        int lX1 = 0;

        int lY1 = 100;

        int lX2 = 200;

        int lY2 = 100;

        g.drawLine(lX1, lY1,  lX2, lY2);

    }
}