package figures;

public class Rectangle extends Parallelogram {
    private double side1;
    private double side2;

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
