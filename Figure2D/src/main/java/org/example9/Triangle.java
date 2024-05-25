package org.example9;

public class Triangle extends Figure{

    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double semiperimeter=(sideA+sideB+sideC)/2;
        double area=Math.sqrt(semiperimeter*(semiperimeter-sideA)*(semiperimeter-sideB)*(semiperimeter-sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }
}
