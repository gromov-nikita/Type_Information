package shapes;

public class Circle extends Ellipse {
    private int radius = 9;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public String toString() { return "Circle"; }
}