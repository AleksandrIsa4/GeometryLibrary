package org.example9;

public abstract class Figure3D {

    protected double height;
    protected double width;
    protected double depth;

    public double getVolume(){
        return height*width*depth;
    }
}
