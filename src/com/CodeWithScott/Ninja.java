package com.CodeWithScott;

public class Ninja extends Vehicle {
    @Override
    public Boolean accelerateVehicle() {
        return true;
    }

    @Override
    public String getVehicleColor() {
        return "Black";
    }

    public Boolean wheelie() {
        return true;
    }

}
