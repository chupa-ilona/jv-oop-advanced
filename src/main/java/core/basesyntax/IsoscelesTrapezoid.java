package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double base1;
    private double base2;
    private double height;
    private String color;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;

    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1
                + ", base2: " + base2
                + ", height: " + height
                + ", color: " + color
        );
    }
}
