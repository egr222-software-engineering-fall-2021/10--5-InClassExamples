import java.awt.*;

public class MainDrawVersion1 {
    public static void main(String[] args){
        Point p1 = new Point();
        //p1.x = 24;
        //p1.y = 36;

        DrawingPanel panel = new DrawingPanel(400,400);
        Graphics g = panel.getGraphics();

        p1.draw(g);
    }
}
