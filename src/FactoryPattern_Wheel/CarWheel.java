package FactoryPattern_Wheel;

public class CarWheel implements Wheel{

    private float diameter;
    private float width;

    public CarWheel(float diameter, float width) {
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
        return "CarWheel{" +
                "diameter=" + diameter +
                ", width=" + width +
                '}';
    }
}
