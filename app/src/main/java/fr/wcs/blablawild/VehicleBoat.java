package fr.wcs.blablawild;

/**
 * Created by wilder on 14/03/18.
 */

    class VehicleBoat extends VehicleAbstract {

    private int hours;

    public VehicleBoat(String brand, String model, int hours) {
        super(brand, model);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String getDescription() {
        return getBrand() + ", " + getModel() + ", " + hours;
    }
}
