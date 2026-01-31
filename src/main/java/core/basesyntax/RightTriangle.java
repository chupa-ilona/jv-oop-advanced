package core.basesyntax;

public class RightTriangle extends Figure{
    private double a;
    private double b;

    public RightTriangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, a: " + a
                + ", b: " + b
                + ", color: " + color);
    }
}
