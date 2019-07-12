package com.stackroute.sp;

public class Car extends Vehicle {

    private boolean isAirBag;
    private boolean isSeatbelt;
    private String gearType;

    public boolean isAirBag() {
        return isAirBag;
    }

    public void setAirBag(boolean airBag) {
        isAirBag = airBag;
    }

    public boolean isSeatbelt() {
        return isSeatbelt;
    }

    public void setSeatbelt(boolean seatbelt) {
        isSeatbelt = seatbelt;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
