package fr.wcs.blablawild;

/**
 * Created by wilder on 14/03/18.
 */

    public class Vehiclecar extends VehicleAbstract {

    private int kilometers;


    public Vehiclecar(String brand, String model, int kilometers) {
        super(brand, model);
        this.kilometers = kilometers;

    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String getDescription() {
        return getBrand() + ", " + getModel() + ", " + kilometers;
    }



}
