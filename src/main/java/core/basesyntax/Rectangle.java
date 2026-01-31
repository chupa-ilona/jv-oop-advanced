package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq. units, width: " + width
                + ", height: " + height
                + ", color: " + color);
    }
}

