import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Scanner;

public class DrawingTest extends Canvas

{
    public static void main (String Arg[])

    {
        System.out.println("DrawingTest starts");

        JFrame frame = new JFrame("DrawingTest");

        Canvas canvas = new DrawingTest();

        String command;

        int cW;

        int cH;

        Scanner scanner = new Scanner(System.in);

        System.out.println("For Canvas, please type C for command");

        System.out.println("For Line, please type L for command");

        System.out.println("For Rectangle, please type R for command");

        System.out.println("For Bucket Fill, please type B for command");

        System.out.println("Please type command");

        command = scanner.next();

        cW = 200;

        cH = 200;

        if (command == "C")

        {

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