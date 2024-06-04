package dev.achmadk.simpleform.data;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    public List<ICalculateAreaShape> shapes;

    public AreaCalculator(List<ICalculateAreaShape> shapes) {
        this.shapes = shapes;
    }

    public Double sum() {
        double result = 0;
        for (ICalculateAreaShape shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }
}
