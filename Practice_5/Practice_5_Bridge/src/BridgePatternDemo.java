public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(6, 4, 14, new RedPen());
        redCircle.draw();

        Shape greenCircle = new Circle(5, 2, 12, new GreenPen());
        greenCircle.draw();
    }
}
