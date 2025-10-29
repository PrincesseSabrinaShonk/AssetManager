package com.pluralsight;
// to do adding properties, constructor, get and setters
public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String vacationHome, String space) {
        super();
    }

    // Constructor with all properties
    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    // getValue to calculate house value
    @Override
    public double getValue() {
        double valuePerSqFt;

        switch (condition) { // Set price per square foot based on condition
            case 1:
                valuePerSqFt = 180;
                break;
            case 2:
                valuePerSqFt = 130;
                break;
            case 3:
                valuePerSqFt = 90;
                break;
            case 4:
                valuePerSqFt = 80;
                break;
            default:
                valuePerSqFt = 0;
        }

        // House value = squareFoot * valuePerSqFt + 25 cents per lot square foot
//        double lotValue = 0.25 * lotSize;
        return (squareFoot * valuePerSqFt) + (lotSize * 0.25);
    }

    // Optional: nice toString() for debugging or printing
    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                ", value=" + getValue() +
                "} " + super.toString();
    }
}