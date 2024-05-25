package org.example9;

public class Operations {

    public double meterToKilometer(double value) {
        return value * 1000;
    }

    public double CentimeterToMeter(double value) {
        return value * 100;
    }

    public double meterSquaredToCentimeterSquared(double value) {
        return value / 10000;
    }

    public boolean compareSquareFigure(Figure figure1, Figure figure2) {
        double value = figure1.getArea() - figure2.getArea();
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
