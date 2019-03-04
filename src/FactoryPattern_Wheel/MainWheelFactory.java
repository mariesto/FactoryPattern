package FactoryPattern_Wheel;

public class MainWheelFactory {
    public static void main(String[] args) {
        Wheel carWheel = WheelFactory.getWheel("CarWheel", 15, 215);
        Wheel bikeWheel = WheelFactory.getWheel("BikeWheel", 18, 245);

        System.out.println("Car specifications : " + carWheel.toString());
        System.out.println("Bike specifications : " + bikeWheel.toString());
    }
}
