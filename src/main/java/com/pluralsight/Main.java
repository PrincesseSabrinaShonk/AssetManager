package com.pluralsight;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House house = new House("Family Home", "2025-03-13", 25000,
                "123 Main Street", 1, 14000, 6000);

        System.out.println("========================================================");

        Vehicle car = new Vehicle("Sabrina Car", "2020-06-10", 15000,
                "Ford Fusion", 2023, 200000);

        assets.add(house);
        assets.add(car);
        assets.add(car);
        Asset a = new Asset("test", "2025-01-01",100);

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());


            if (asset instanceof House) {
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                System.out.println("Make & Model: " + car.getMakeModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Odometer:" + car.getOdometer());
            }

            System.out.println("===========================================");
        }
    }

}