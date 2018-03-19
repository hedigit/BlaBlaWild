package fr.wcs.blablawild;

/**
 * Created by wilder on 14/03/18.
 */

public class Vehicleplane extends VehicleAbstract {

    private int speed;

    public Vehicleplane(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getDescription() {
        return getBrand() + " , " + getModel() +" , " + getSpeed();
    }
}
