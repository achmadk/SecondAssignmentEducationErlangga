package dev.achmadk.simpleform.data;

public class SumCalculatorOutputter {
    private IAreaCalculator areaCalculator;

    public SumCalculatorOutputter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String toString() {
        return "Output: " + this.areaCalculator.sum();
    }
}
