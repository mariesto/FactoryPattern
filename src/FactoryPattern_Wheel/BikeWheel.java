package FactoryPattern_Wheel;

public class BikeWheel implements Wheel {

    private float diameter;
    private float width;

    public BikeWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }

    @Override
    public float getDiameter() {
        return diameter;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "BikeWheel{" +
                "diameter=" + diameter +
                ", width=" + width +
                '}';
    }
}
