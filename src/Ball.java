import java.awt.*;
import java.util.GregorianCalendar;

public class Ball {
    double x;
    double y;
    int r;

    double vx;
    double vy;

    public Ball(double x, double y, int r, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
    }

    public void paint(Graphics g){
        g.fillOval((int) (x-r), (int) y-r, 2*r, 2*r);
    }

    public void update(int width, int height){
        x += vx;
        if (x < 0){
            x = width;
        }
        if (x > width){
            x = 0;
        }

        y += vy;
        if (y < 0){
            y = height;
        }
        if (y > height){
            y = 0;
        }
    }
}
