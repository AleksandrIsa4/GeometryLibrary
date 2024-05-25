package org.example9;

public class Cube extends Figure3D {

    public Cube(double height) {
        this.height=height;
    }

    @Override
    public double getVolume(){
        return height*height*height;
    }

}
