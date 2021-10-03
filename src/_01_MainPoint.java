public class _01_MainPoint {
    public static void main(String[] args) {
        // create two Point objects
        Point_v1 p1 = new Point_v1();
        p1.y = 2;
        Point_v1 p2 = new Point_v1();
        p2.x = 4;

        System.out.println(p1.x + ", " + p1.y);   // 0, 2

        // move p2 and then print it
        p2.x += 2;
        p2.y++;
        System.out.println(p2.x + ", " + p2.y);   // 6, 1
    }
}
