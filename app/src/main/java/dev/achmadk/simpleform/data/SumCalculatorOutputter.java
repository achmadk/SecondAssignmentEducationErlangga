package dev.achmadk.simpleform.data;

import androidx.annotation.NonNull;

public class SumCalculatorOutputter {
    private final IAreaCalculator areaCalculator;

    public SumCalculatorOutputter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    @NonNull
    public String toString() {
        return "Output: " + this.areaCalculator.sum();
    }
}
