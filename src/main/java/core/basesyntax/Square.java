package core.basesyntax;

public class Square implements Figure {
    private double side;
    private String color;

    public Square(String color, double side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq. units, side: " + side
                + ", color: " + color);
    }
}


