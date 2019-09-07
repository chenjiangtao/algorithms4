import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //
        //StdDraw.setPenRadius(0.05);
        //StdDraw.setPenColor(StdDraw.BLUE);
        //StdDraw.point(0.5, 0.5);
        //StdDraw.setPenColor(StdDraw.MAGENTA);
        //StdDraw.line(0.2, 0.2, 0.8, 0.2);
        //
        //
        //double[] x = { 0.1, 0.2, 0.3, 0.2 };
        //double[] y = { 0.2, 0.3, 0.2, 0.1 };
        //StdDraw.filledPolygon(x, y);
        //
        //Font font = new Font("Arial", Font.BOLD, 60);
        //StdDraw.setFont(font);
        //StdDraw.text(0.5, 0.5, "Hello, World");

        //StdDraw.setScale(-2, +2);
        //StdDraw.enableDoubleBuffering();
        //
        //for (double t = 0.0; true; t += 0.02) {
        //    double x = Math.sin(t);
        //    double y = Math.cos(t);
        //    StdDraw.clear();
        //    StdDraw.filledCircle(x, y, 0.05);
        //    StdDraw.filledCircle(-x, -y, 0.05);
        //    StdDraw.show();
        //    StdDraw.pause(20);
        //}


        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) a[i] = StdRandom.random();
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }

    }
}
