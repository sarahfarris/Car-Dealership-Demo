package dealership;

import java.util.Objects;

public class Vehicle {

    private String vin;
    private int year;
    private String makeAndModel;
    private double odometer;
    boolean sold;
    int dealershipID;
    private double price;

    public Vehicle(String vin, String makeAndModel, int year,  double odometer, boolean sold, int dealershipId, double price) {
        this.vin = vin;
        this.year = year;
        this.makeAndModel = makeAndModel;
        this.odometer = odometer;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getDealershipID() {
        return dealershipID;
    }

    public void setDealershipID(int dealershipID) {
        this.dealershipID = dealershipID;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toFileString() {
        return vin + "|" + year + "|" + makeAndModel + "|" + odometer + "|" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vin, vehicle.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
