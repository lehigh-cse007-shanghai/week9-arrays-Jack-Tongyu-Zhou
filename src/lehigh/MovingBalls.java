package lehigh;

import processing.core.PApplet;

public class MovingBalls extends PApplet {

    public void settings() {
        size(500, 500);
    }

    int x = 0;
    int y = 0;
    int speedx = 5;
    int speedy = 2;
    int x1 = 212;
    int y1 = 323;
    int speedx1 = 4;
    int speedy1 = 1;
    int x2 = 10;
    int y2 = 200;
    int speedx2 = 2;
    int speedy2 = 3;


    public void draw() {
        background(0);
        ellipse(x, y, 20, 20);
        x += speedx;
        y += speedy;
        ellipse(x1, y1, 20, 20);
        x1 += speedx1;
        y1 += speedy1;
        ellipse(x2, y2, 20, 20);
        x2 += speedx2;
        y2 += speedy2;

        if (x > 500 || x < 0) {
            speedx *= -1;
        }
        if (y > 500 || y < 0) {
            speedy *= -1;
        }

        if (x1 > 500 || x1 < 0) {
            speedx1 *= -1;
        }
        if (y1 > 500 || y1 < 0) {
            speedy1 *= -1;
        }

        if (x2 > 500 || x2 < 0) {
            speedx2 *= -1;
        }
        if (y2 > 500 || y2 < 0) {
            speedy2 *= -1;
        }


    }
}