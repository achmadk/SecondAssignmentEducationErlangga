package dev.achmadk.simpleform.data;

public class Cube implements IShape, IThreeDimentionalShape, ICalculateAreaShape {
    public Double side;

    public Cube(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return 6 * side * side;
    }

    @Override
    public Double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public Double calculateArea() {
        return getArea();
    }
}
