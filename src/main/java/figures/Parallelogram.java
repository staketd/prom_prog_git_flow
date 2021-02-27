package figures;

public class Parallelogram implements Figure {
    private double side1;
    private double side2;
    private double angle;

    @Override
    public double getArea() {
        return Math.sin(angle) * side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
