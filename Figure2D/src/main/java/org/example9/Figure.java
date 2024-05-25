package org.example9;

public abstract class Figure {

    protected  double height; // Высота
    protected  double width; // Ширина

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2*(height + width);
    }
}
