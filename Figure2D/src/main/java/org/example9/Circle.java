package org.example9;

public class Circle extends Figure{

    private double radius;

    private double diameter;

    public Circle(double radius){
        this.radius=radius;
        this.diameter=2*radius;
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.PI)*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
