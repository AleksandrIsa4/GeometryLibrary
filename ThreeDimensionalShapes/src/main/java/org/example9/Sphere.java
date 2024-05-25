package org.example9;

public class Sphere extends Figure3D {

    public double radius;

    public Sphere(double radius){
        this.radius=radius;
    }

    @Override
    public double getVolume(){
        return 4/3*Math.PI*Math.cbrt(radius);
    }
}
