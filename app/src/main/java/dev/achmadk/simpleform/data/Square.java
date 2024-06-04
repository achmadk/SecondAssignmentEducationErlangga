package dev.achmadk.simpleform.data;

public class Square implements IShape, ICalculateAreaShape {
    public Double length;

    public Square(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return this.length * this.length;
    }

    @Override
    public Double calculateArea() {
        return getArea();
    }
}

