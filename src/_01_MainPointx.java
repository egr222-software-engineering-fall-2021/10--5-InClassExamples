import java.awt.*;

public class _01_MainPointx {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.setY(2);
        Point p2 = new Point();
        p2.setX(4);

        System.out.println(p1.getX() + ", " + p1.getY());   // 0, 2

        // move p2 and then print it
        p2.setX(p2.getX()+2);
        // p2.y++;
        //System.out.println(p2.x + ", " + p2.y);   // 6, 1

/*
        Point p1 = new Point(5,2);
        Point p2 = new Point(4, 3);

        System.out.println();
 */
    }
}
