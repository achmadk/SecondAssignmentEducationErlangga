package dev.achmadk.simpleform.data;

public class Circle implements IShape, ICalculateAreaShape {
    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double calculateArea() {
        return getArea();
    }
}
